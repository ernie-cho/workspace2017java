package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170530_db_examtable2 {
	public static void main(String[] args){
		try{
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*execute�� ���� ���̺� ����*/
			k20_stmt.execute( " create table examtable(" +
							  " name varchar(20)," +
							  " studentid int not null primary key," +
							  " kor		int, " +
							  " eng     int, " +
							  " mat     int)" +
							  " DEFAULT CHARSET = utf8");
			
			/*��ü ������ ���� ����*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}
