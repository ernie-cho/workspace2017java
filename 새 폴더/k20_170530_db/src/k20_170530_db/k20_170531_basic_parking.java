package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170531_basic_parking {

	public static void main(String[] args) {
		try{
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			
			/*execute�� ���� ���̺� ����*/
			k20_stmt.execute( " create table parking(" +    /*parking ���̺� ����*/
					  " seq 			 int," +			/*sequence �÷� ����*/
					  " parking_no 		 varchar(300)," +	/*�����������ȣ �÷� ����*/
					  " parking_name	 varchar(300), " +	/*������� �÷� ����*/
					  " parking_type     varchar(300), " +	/*���������� �÷� ����*/
					  " parking_address  varchar(300)," +	/*�����������ּ� �÷� ����*/
					  " parking_road     varchar(300)," + 	/*���������θ��ּ� �÷� ����*/
					  " parking_size	 varchar(300)," + 	/*������ȹ�� �÷� ����*/
					  "	open_day		 varchar(300),"+ 	/*����� �÷� ����*/
					  " price			 varchar(300)," +	/*������� �÷� ����*/
					  " contact 		 varchar(300)," +	/*����ó �÷� ����*/
					  " latitude 		 double," +			/*���� �÷� ����*/
					  " longitude		 double," +			/*�浵 �÷� ����*/
					  /*primary key�� sequence�� �����������ȣ ����*/
					  " constraint pk primary key(seq,parking_no)) " + 
					  " DEFAULT CHARSET = utf8");/*character set utf8�� ���� */
			
			/*���̺� ���� �ǽ�*/
			//k20_stmt.execute("drop table parking");
			
			/*��ü ������ ���� ����*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
