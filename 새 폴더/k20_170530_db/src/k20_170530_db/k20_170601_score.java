package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170601_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			/*execute를 통한 테이블 생성*/
			k20_stmt.execute( " create table score(" +
							  " studentid int not null primary key," +
							  " name varchar(20)," +
							  " kor		int, " +
							  " eng     int, " +
							  " mat     int)" +
							  " DEFAULT CHARSET = utf8");
			/*테이블 삭제 실습*/
			//k20_stmt.execute("drop table score");
			
			/*객체 생성과 연결 종료*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
