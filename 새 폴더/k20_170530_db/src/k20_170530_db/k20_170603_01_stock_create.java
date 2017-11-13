package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170603_01_stock_create {

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
					k20_stmt.execute( " create table stock(" +		
							"	stnd_iscd 	varchar(15), " +          	/*  NOT_NULL ǥ�� �����ڵ�                      */ ///////
							"	bsop_date 	date 	, " +          		/*  NOT_NULL �ֽ� ���� ����                     */ ///////
							"	shrn_iscd 	varchar(15) ,	" +         /*  �������� ���� �����ڵ�            			*/ ///////
							"	stck_prpr 	int 	, " +          		/*  �ֽ� ����                                   */ ///////
							"	stck_oprc 	int 	, " +          		/*  �ֽ� �ð�                                   */ ///////
							"	stck_hgpr 	int 	, " +          		/*  �ֽ� �ְ�                                 */ ///////
							"	stck_lwpr 	int 	, " +          		/*  �ֽ� ������                                 */ ///////							 
							"	acml_vol 	bigint 	, " +          		/*  ���� �ŷ���                                 */ ///////
							"	acml_tr_pbmn 	bigint 	, " +       	/*  ���� �ŷ� ���                              */ ///////							
							" 	constraint pk primary key(stnd_iscd,bsop_date)) " +
							" 	DEFAULT CHARSET = utf8");
					/*���̺� ���� �ǽ�*/
					//k20_stmt.execute("drop table stock");
					
					/*��ü ������ ���� ����*/
					k20_stmt.close();
					k20_conn.close();
					
				}catch (Exception e){
					e.printStackTrace();
				}
	}

}
