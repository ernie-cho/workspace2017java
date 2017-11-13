/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Freewifi1 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			// ip: 나의 우분투접속주소, 포트: 3306을 포워딩한 주소, /DB이름, (root,db사용자), 비번
			Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/Exam2", "root", "dudeh123");
			
			Statement stmt = conn1.createStatement();
			
			// 테이블 삭제
			stmt.execute("drop table freewifi;");
			
			// 테이블 생성
			stmt.execute( " create table freewifi(" + // 테이블생성
						  " inst_place varchar(200), " + // 설치장소명
						  " inst_place_detail varchar(200), " + // 설치장소 상세
						  " inst_city varchar(200), " +  // 설치 시도 명
						  " inst_country varchar(200), " + // 설치 시군구 명
						  " inst_place_flag varchar(200), " +  // 설치 시설 구분
						  " service_provider varchar(200), " + // 서비스제공사 명
						  " wifi_ssid varchar(200), " + // 와이파이 ssid
						  " inst_date varchar(200), " + // 설치년월 -> 정제할 것
						  " place_addr_road varchar(200), " + // 소재지 도로명 주소
						  " place_addr_land varchar(200), " + // 소재지 지번주소
						  " manage_office varchar(200), " + // 관리 기관명
						  " manage_office_phone varchar(200), " + // 관리 기관 전화번호
						  " latitude double, " + // 위도
						  " longitude double, " + // 경도
						  " write_date varchar(200)) " + // 데이터 기준 일자
						  " DEFAULT CHARSET=utf8;"
						  );
		
			
			stmt.close();
			conn1.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
*/