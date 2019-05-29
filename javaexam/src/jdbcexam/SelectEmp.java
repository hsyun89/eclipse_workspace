package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmp {
	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
		Statement stmt = conn.createStatement();
		Random random = new Random();
		boolean flag = random.nextBoolean();
		if (flag) {
			ResultSet rs = stmt.executeQuery("SELECT ename, to_char(sal,'999,999') sal from emp");
			while (rs.next()) {
				System.out.print(rs.getString("ename") + "	������ ������");
				System.out.println(rs.getString("sal") + "���Դϴ�.");
			}
			rs.close();
		} 
//		else {
//			ResultSet rs = stmt.executeQuery(
//					"SELECT ename, to_char(hiredate,'yyyy') hiredateY,to_char(hiredate,'mm') hiredateM,to_char(hiredate,'dd') hiredateD from emp");
//			while (rs.next()) {
//				System.out.print(rs.getString("ename") + "	������ ");
//				System.out.print(rs.getString("hiredateY") + "�� ");
//				System.out.print(rs.getString("hiredateM") + "�� ");
//				System.out.println(rs.getString("hiredateD") + "�Ͽ� �Ի��Ͽ����ϴ�.");
//			}
//			rs.close();
//		}
		
//		else {
//			ResultSet rs = stmt.executeQuery(
//					"SELECT ename, to_char(hiredate,'yyyymmdd') hiredate from emp");
//			while (rs.next()) {
//				System.out.print(rs.getString("ename") + "	������ ");
//				String rsString=rs.getString("hiredate");
//				System.out.print(rsString.substring(0,4) + "�� ");
//				System.out.print(rsString.substring(4,6)  + "�� ");
//				System.out.println(rsString.substring(6) + "�Ͽ� �Ի��Ͽ����ϴ�.");
//			}
//			rs.close();
//		}
		
		else {
			ResultSet rs = stmt.executeQuery(
					"SELECT ename, to_char(hiredate,'yyyy\"�� \"mm\"�� \"dd\"��\"') hiredate from emp");
			while (rs.next()) {
				System.out.print(rs.getString("ename") + "	������ ");
				System.out.println(rs.getString("hiredate") + "�� �Ի��Ͽ����ϴ�.");
			}
			rs.close();
		}
		stmt.close();
		conn.close();
	}
}
