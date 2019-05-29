package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchEmp2 {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		Scanner sc = new Scanner(System.in);
		String request = null;
		PreparedStatement pstmt = conn
				.prepareStatement("select ename from emp e, dept d where e.deptno = d.deptno and dname=?");
		PreparedStatement pstmt2 = conn.prepareStatement("select dname from dept where dname=?");

		while (true) { // ���ѷ���
			System.out.println("�μ��� or ����");
			request = sc.next(); // �Է¹ޱ�
			if (request.equals("����")) { // ���Ῡ��
				break;
			} else {
				pstmt2.setString(1, request); // 1�μ��̸��� ���� ����
				if (pstmt2.executeUpdate() != 0) { // 1-1�����ϴ� �μ��̸��̶��
					pstmt.setString(1, request); // 2�μ��� �ִ� �����̸� �ޱ�
					if (pstmt.executeUpdate() != 0) { // 2-1������ �Ѹ��̻� �����ϸ� ���~
						ResultSet rs = pstmt.executeQuery();
						System.out.println(request + " �μ����� �ٹ��ϴ� ������");
						while (rs.next()) {
							System.out.println(rs.getString("ename"));
						}
					} else { // 2-2������ �Ѹ� ���ٸ�
						System.out.println(request + "�μ����� �ٹ��ϴ� ������ �����ϴ�.");
					}
				} else { // 1-2 �������� �ʴ� �μ��� �Է��ߴٸ�
					System.out.println(request + " �μ��� �����ϴ�.");
				}
			}
		}
		sc.close();
	}
}
