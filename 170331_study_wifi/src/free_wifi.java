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
			//������ ���� �о�� --> ������ �� DB�ʹ� �� ��� ����...
			if((readtxt = br.readLine())==null){
				System.out.println("�� �����Դϴ�");
				return;
			}
			
			String[] field_name = readtxt.split("\t");
			
			int LineCnt=0;
			while((readtxt = br.readLine()) != null){
				String[] field = readtxt.split("\t");
				String QueryTxt;
				/*
				������ DB�ٷ�� ���α׷��� �������� �ִٸ� �밡���� ���� �����̴�
				�Ʒ����� ��� ���ļ� ������ �� �˼� �ְ� �Ѱ��� ���� ������
				���α׷� ������ �°� ���ſ�..�״�� ���� ����
				���� ���߷��� �ټ����� ���ٿ� ����.. ���Ͽ�..
				%s�� �C����ǥ(') �ѰͰ� ���Ѱ��� ���̸� �� �����ض�..
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
			System.out.printf("%d��° �׸� Insert OK [%s]\n", LineCnt, QueryTxt);
			
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
