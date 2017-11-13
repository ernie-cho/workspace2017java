package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class k20_170530_db {
	/*Lec10. 17-05-31, 조영도, JDBC기본 프로그램*/
	public static void main(String[] args){
		try{
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer","root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			/*ResultSet 인터페이스 생성*/
			ResultSet k20_rset = k20_stmt.executeQuery("show databases");
			//ResultSet k20_rset = k20_stmt.executeQuery("show tables");
			
			while(k20_rset.next()){
					/*필드 값 가져오기*/
					System.out.println("값 : " +k20_rset.getString(1));
			}
			/*각종 인터페이스 및 설정, 생성 종료*/
			k20_rset.close();
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}
