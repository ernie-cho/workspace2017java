/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Freewifi1 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			// ip: ���� ����������ּ�, ��Ʈ: 3306�� �������� �ּ�, /DB�̸�, (root,db�����), ���
			Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/Exam2", "root", "dudeh123");
			
			Statement stmt = conn1.createStatement();
			
			// ���̺� ����
			stmt.execute("drop table freewifi;");
			
			// ���̺� ����
			stmt.execute( " create table freewifi(" + // ���̺����
						  " inst_place varchar(200), " + // ��ġ��Ҹ�
						  " inst_place_detail varchar(200), " + // ��ġ��� ��
						  " inst_city varchar(200), " +  // ��ġ �õ� ��
						  " inst_country varchar(200), " + // ��ġ �ñ��� ��
						  " inst_place_flag varchar(200), " +  // ��ġ �ü� ����
						  " service_provider varchar(200), " + // ���������� ��
						  " wifi_ssid varchar(200), " + // �������� ssid
						  " inst_date varchar(200), " + // ��ġ��� -> ������ ��
						  " place_addr_road varchar(200), " + // ������ ���θ� �ּ�
						  " place_addr_land varchar(200), " + // ������ �����ּ�
						  " manage_office varchar(200), " + // ���� �����
						  " manage_office_phone varchar(200), " + // ���� ��� ��ȭ��ȣ
						  " latitude double, " + // ����
						  " longitude double, " + // �浵
						  " write_date varchar(200)) " + // ������ ���� ����
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