import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class free_wifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/Exam2", "root", "dudeh123");
			Statement stmt1 = conn1.createStatement();
			
			FileInputStream f = new FileInputStream("C:\\test\\free_wifi.txt");
			BufferedInputStream bis = new BufferedInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(bis));
			
			String readtxt;
			//한줄을 먼저 읽어야 --> 이줄은 뭐 DB와는 별 상관 없지...
			if((readtxt = br.readLine())==null){
				System.out.println("빈 파일입니다");
				return;
			}
			
			String[] field_name = readtxt.split("\t");
			
			int LineCnt=0;
			while((readtxt = br.readLine()) != null){
				String[] field = readtxt.split("\t");
				String QueryTxt;
				/*
				앞으로 DB다루는 프로그램을 만질일이 있다면 노가다의 끝을 볼것이다
				아래같이 몇개씩 뭉쳐서 쓰든지 잘 알수 있게 한개씩 끊어 쓰든지
				프로그램 문법에 맞게 쓰셔요..그대신 연습 연습
				갯수 맞추려고 다섯개씩 한줄에 썻다.. 노하우..
				%s에 혿따옴표(') 한것과 안한것의 차이를 잘 생각해라..
				*/
			QueryTxt = String.format("INSERT INTO freewifi ("
					+ "inst_place, inst_place_detail, inst_city, inst_country,inst_place_flag,"
					+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
					+ "manage_office, manage_office_phone, latitude, longitude, write_date)"
					+ "VALUES ("
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s', %s, %s, '%s');",
					field[0], field[1], field[2], field[3], field[4],
					field[5], field[6], field[7], field[8], field[9],
					field[10],field[11],field[12],field[13],field[14]);
			stmt1.execute(QueryTxt);
			System.out.printf("%d번째 항목 Insert OK [%s]\n", LineCnt, QueryTxt);
			
			LineCnt++;
			}//while((readtxt = br.readLine()) != null)
			br.close();
			
			stmt1.close();
			conn1.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
