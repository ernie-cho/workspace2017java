package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170530_db_exam3 {
	public static void main(String[] args){
		try{
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			/*execute를 통한 데이터 삽입*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('효민',209901,95,100,95)"); /*효민 학생 정보 입력*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('보람',209902,95,95,95)");  /*보람 학생 정보 입력*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('은정',209903,100,100,100)");/*은정 학생 정보 입력*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('지연',209904,100,95,90)"); /*지연 학생 정보 입력*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('소연',209905,80,100,70)"); /*소연 학생 정보 입력*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('큐리',209906,100,100,70)");/*큐리 학생 정보 입력*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('화영',209907,70,70,70)");  /*화영 학생 정보 입력*/
			
			/*객체 생성과 연결 종료*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}
