package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchEmp {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		Scanner sc = new Scanner(System.in);
		String quest = null;

		while (true) {
			int count = 0;
			System.out.println("직원의 이름을 입력하시오 or 종료");
			quest = sc.next();
			if (quest.equals("종료"))
				break;
			else {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(
						"select ename, to_char(hiredate,'yyyy\"년\"mm\"월\"' ) hiredate,deptno from emp where ename = upper('"
								+ quest + "')");
				while (rs.next()) {
					System.out.println(rs.getString("ename") + "직원은 근무중 입니다.");
					System.out.print(rs.getString("hiredate") + "에 입사했고 현재");
					System.out.println(rs.getString("deptno") + "부서에서 근무하고 있습니다.");
					count++;
				}
				if (count == 0) {
					System.out.println(quest + "직원은 근무하지 않습니다.");
				}
				rs.close();
			}
		}
		sc.close();
	}

}
