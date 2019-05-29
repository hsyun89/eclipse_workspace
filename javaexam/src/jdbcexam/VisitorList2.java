package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VisitorList2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ����̹�, ������ ã�Ƽ� �����н��� �߰��������
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			// jdbc:DB�����̸�:thin����̹�@�ּ�:��Ʈ:�̸�, ���̵�, ���
			stmt = conn.createStatement();
			String sql = "select name, writedate, memo from visitor";
			// ;�� �ڹٿ����� ������
			rs = stmt.executeQuery(sql);
			// ResultSet ������� �޴� ��ü
			// executeQuery ����Ʈ���� ����� �� ���� �޼ҵ�
			while (rs.next()) {
				System.out.print(rs.getString("name"));
				System.out.print(rs.getString("writedate"));
				System.out.println(rs.getString("memo"));
			}
		} catch (Exception e) {
			System.err.println("�����߻�" + e);
		} finally {
			try {
				//DB���� �������� ��ü ������ü�� �ȵ� �� ����
				//������ �ȵǾ��µ� �������� �����Ƿ� if���� �־���
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
