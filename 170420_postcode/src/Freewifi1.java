import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Freewifi1 {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// ip: ���� ����������ּ�, ��Ʈ: 3306�� �������� �ּ�, /DB�̸�, (root,db�����), ���
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			
			Statement stmt = conn.createStatement();
			
			// ���̺� ����
			//stmt.execute("drop table freewifi;");
			//�׽�Ʈ ���̺� ����
			/*stmt.execute("create table exam3(a varchar2(200),b varchar2(200), c varchar2(200))");
			stmt.execute("commit");*/
			// ���̺� ����
			stmt.execute( "create table freewifi2(" + // ���̺����
						  "inst_place varchar2(200), " + // ��ġ��Ҹ�
						  "inst_place_detail varchar2(200), " + // ��ġ��� ��
						  "inst_city varchar2(200), " +  // ��ġ �õ� ��
						  "inst_country varchar2(200), " + // ��ġ �ñ��� ��
						  "inst_place_flag varchar2(200), " +  // ��ġ �ü� ����
						  "service_provider varchar2(200), " + // ���������� ��
						  "wifi_ssid varchar2(200), " + // �������� ssid
						  "inst_date varchar2(200), " + // ��ġ��� -> ������ ��
						  "place_addr_road varchar2(200), " + // ������ ���θ� �ּ�
						  "place_addr_land varchar2(200), " + // ������ �����ּ�
						  "manage_office varchar2(200), " + // ���� �����
						  "manage_office_phone varchar2(200), " + // ���� ��� ��ȭ��ȣ
						  "latitude number, " + // ����
						  "longitude number, " + // �浵
						  "write_date varchar2(200)) "  // ������ ���� ����
						  
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
