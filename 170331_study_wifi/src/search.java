import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn1 = DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/Exam2", "root", "dudeh123");
			Statement stmt1 = conn1.createStatement();
			
			double lat = 37.3860521; double lng=127.1214038;
			
			String QueryTxt;
			QueryTxt = String.format("select * from freewifi where " +
					"SQRT ( POWER ( latitude-%f,2) + POWER (longitude-%f,2) ) = " +
					"(select MIN( SQRT( POWER( latitude-%f,2) + POWER (longitude-%f,2) ) ) from freewifi);",
					lat, lng, lat, lng);
			
			QueryTxt = "select * from freewifi ";
		  //QueryTxt = "select * from freewifi where service_provider ='SKT'";
	      //QueryTxt = "select * from freewifi where inst_country = '������'";
			
			ResultSet rset1 = stmt1.executeQuery(QueryTxt);
			int iCnt = 0;
			while (rset1.next()){
				System.out.printf("*(%d)*********************************\n", iCnt++);
				System.out.printf("��ġ��Ҹ�			:%s\n",rset1.getString(1));
				System.out.printf("��ġ��һ�		:%s\n",rset1.getString(2));
				System.out.printf("��ġ�õ���			:%s\n",rset1.getString(3));
				System.out.printf("��ġ�ñ�����		:%s\n",rset1.getString(4));
				System.out.printf("��ġ�ü�����		:%s\n",rset1.getString(5));
				System.out.printf("�����������		:%s\n",rset1.getString(6));
				System.out.printf("��������SSID		:%s\n",rset1.getString(7));
				System.out.printf("��ġ���			:%s\n",rset1.getString(8));
				System.out.printf("���������θ��ּ�		:%s\n",rset1.getString(9));
				System.out.printf("�����������ּ�		:%s\n",rset1.getString(10));
				System.out.printf("���������			:%s\n",rset1.getString(11));
				System.out.printf("���������ȭ��ȣ		:%s\n",rset1.getString(12));
				System.out.printf("����			:%s\n",rset1.getString(13));
				System.out.printf("�浵			:%s\n",rset1.getString(14));
				System.out.printf("�����ͱ�������		:%s\n",rset1.getString(15));
				System.out.printf("****************************************\n");
			}
			
			rset1.close();
			stmt1.close();
			conn1.close();
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
