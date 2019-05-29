package jdbcexam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class ConnectDB {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//����̹�, ������ ã�Ƽ� �����н��� �߰��������
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		//jdbc:DB�����̸�:thin����̹�@�ּ�:��Ʈ:�̸�, ���̵�, ���
		System.out.println(conn.getClass().getName()); //Ŭ���� �̸� ����
		DatabaseMetaData mdata = conn.getMetaData();
		System.out.println(mdata.getClass().getName()); //Ŭ���� �̸� ����
		System.out.println("���ӵ� DB ���� : " + mdata.getDatabaseProductName());
		conn.close();
	}
}
