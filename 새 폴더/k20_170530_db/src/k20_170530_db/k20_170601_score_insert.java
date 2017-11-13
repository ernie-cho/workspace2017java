package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170601_score_insert {

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
			/*데이터를 만들 개수 설정*/
			int personCnt = 1000;
			
			/*1000명 생성된 데이터 insert*/
			for(int i = 0 ; i < personCnt ; i++){
				/*랜덤 점수 생성*/
				String name = String.format("홍길%04d",i+1);
				int kor1 = (int)( Math.random() * 100) +1;
				int eng1 = (int)( Math.random() * 100) +1;
				int mat1 = (int)( Math.random() * 100) +1;
				/*쿼리 입력*/
				k20_stmt.execute( " INSERT INTO score ( studentid, name, kor, eng, mat )"
						+ "values("+ (i+1) + ",'" + name + "',"
						+ kor1 +  "," + eng1 +  "," + mat1 +")");
				
			}
			/*객체 생성과 연결 종료*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
