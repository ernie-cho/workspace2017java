package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class k20_170530_db {
	/*Lec10. 17-05-31, ������, JDBC�⺻ ���α׷�*/
	public static void main(String[] args){
		try{
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer","root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*ResultSet �������̽� ����*/
			ResultSet k20_rset = k20_stmt.executeQuery("show databases");
			//ResultSet k20_rset = k20_stmt.executeQuery("show tables");
			
			while(k20_rset.next()){
					/*�ʵ� �� ��������*/
					System.out.println("�� : " +k20_rset.getString(1));
			}
			/*���� �������̽� �� ����, ���� ����*/
			k20_rset.close();
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}
