package k20_170530_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class k20_170531_basic_parking_insert {

	public static void main(String[] args) {
		String sqlstr = null;
		
		try{
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			
			
			File k20_f = new File("C:\\test\\전국주차장표준데이터_3.txt");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수*/
			String k20_readtxt;
			
			/*시작 시간을 저장할 변수*/
			long startTime = System. currentTimeMillis ();
			
			/*PreparedStatement를 통한 데이터 삽입*/
			sqlstr=   " insert into parking (seq, parking_no, parking_name, parking_type,"
					+ " parking_address, parking_road, parking_size, open_day, price, contact,"
					+ " latitude, longitude) values (?,?,?,?,?,?,?,?,?,?,?,?)"; 
			PreparedStatement pstmt = k20_conn.prepareStatement(sqlstr);
			
			
			int count = 0;
			/*파일의 끝에 도달하기 까지 txt파일 데이터를 Table에 insert */
			while((k20_readtxt=k20_br.readLine())!=null){
				/*StringBuffer를 이용한 문자열 생성*/
				StringBuffer k20_s = new StringBuffer();
				/*("\t")를 잘라낸 라인을 필드배열에 저장*/
				String[] k20_field = k20_readtxt.split("\t");
				/* 데이터를 sql문안에 insert */
				pstmt.setString(1, k20_field[0]);
				pstmt.setString(2, k20_field[1]);
				pstmt.setString(3, k20_field[2]);
				pstmt.setString(4, k20_field[3]);
				pstmt.setString(5, k20_field[4]);
				pstmt.setString(6, k20_field[5]);
				pstmt.setString(7, k20_field[6]);
				pstmt.setString(8, k20_field[7]);
				pstmt.setString(9, k20_field[8]);
				pstmt.setString(10, k20_field[9]);
				pstmt.setDouble(11,Double.parseDouble(k20_field[10]));
				pstmt.setDouble(12,Double.parseDouble(k20_field[11]));
				count++;
				pstmt.execute();
			}
			/*종료 시간 측정할 변수*/
			long endTime = System. currentTimeMillis (); 
			
			/*객체 생성과 연결 종료*/
			k20_stmt.close();
			k20_conn.close();
			
			/*종료 출력*/
			System.out.println("Finish");
			/*종료 시점 출력*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			System.out.println("Data Inserted: " + count); 
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
