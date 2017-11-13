import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Freewifi1 {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// ip: 나의 우분투접속주소, 포트: 3306을 포워딩한 주소, /DB이름, (root,db사용자), 비번
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			
			Statement stmt = conn.createStatement();
			
			// 테이블 삭제
			//stmt.execute("drop table freewifi;");
			//테스트 테이블 생성
			/*stmt.execute("create table exam3(a varchar2(200),b varchar2(200), c varchar2(200))");
			stmt.execute("commit");*/
			// 테이블 생성
			stmt.execute( "create table freewifi2(" + // 테이블생성
						  "inst_place varchar2(200), " + // 설치장소명
						  "inst_place_detail varchar2(200), " + // 설치장소 상세
						  "inst_city varchar2(200), " +  // 설치 시도 명
						  "inst_country varchar2(200), " + // 설치 시군구 명
						  "inst_place_flag varchar2(200), " +  // 설치 시설 구분
						  "service_provider varchar2(200), " + // 서비스제공사 명
						  "wifi_ssid varchar2(200), " + // 와이파이 ssid
						  "inst_date varchar2(200), " + // 설치년월 -> 정제할 것
						  "place_addr_road varchar2(200), " + // 소재지 도로명 주소
						  "place_addr_land varchar2(200), " + // 소재지 지번주소
						  "manage_office varchar2(200), " + // 관리 기관명
						  "manage_office_phone varchar2(200), " + // 관리 기관 전화번호
						  "latitude number, " + // 위도
						  "longitude number, " + // 경도
						  "write_date varchar2(200)) "  // 데이터 기준 일자
						  
						  );
			stmt.execute("commit");
			
			System.out.println("Finish");
			
			stmt.close();
			conn.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
