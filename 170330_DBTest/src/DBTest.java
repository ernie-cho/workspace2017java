import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Connection conn =DriverManager.getConnection("jdbc:mysql://192.168.23.88:33060/testDB", "root", "1234");
			Connection conn1 =DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/testDB", "root", "dudeh123");
			Connection conn2 =DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/testDB", "root", "dudeh123");
			Connection conn3 =DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/testDB", "root", "dudeh123");
			Statement stmt1 = conn1.createStatement();
			Statement stmt2 = conn2.createStatement();
			Statement stmt3 = conn3.createStatement();
			ResultSet rset1 = stmt1.executeQuery("select * from examtable;");//뭔가 쏘고 답을 받는게 쿼리 그냥 execte하면 보내기만 하는거
			ResultSet rset2 = stmt2.executeQuery("select * from professor;");
			
			/*System.out.println("examtable");
			while(rset1.next()){
				//결과물처리
				
				for(int i = 1;i <8;i++){
					System.out.print(rset1.getString(i)+"\t" );
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("professor table");
			while(rset2.next()){
				
				for(int i = 1;i <8;i++){
					System.out.print(rset2.getString(i)+"\t" );
				}
				System.out.println();
			}*/
		/*	String [] name = {"Sara", "Ruby", "Tom", "Jimmy", "Ernie", "David", "Luna", "Tim", "Jenny", "Tina"};
			int [] stuID = {209907,209908,209909,209910,209911,209912,209913,209914,209915,209916};
			int [] kor = {100,90,80,70,60,50,40,30,20,10};
			int [] eng = {10,20,30,40,50,60,70,80,90,100};
			int [] mat = {50,60,70,80,90,100,10,20,30,40};*/
			
			
			
			String ask = null; //계속할지 물어보기
			String endSign = "and";
			int cnt = 0; //몇명 입력할건지 물어보기
			//입력 받을 배열
			String [] name = new String [100];
			int [] stuID = new int [100];
			int [] kor = new int [100];
			int [] eng = new int [100];
			int [] mat = new int [100];
			int j = 0;
			Scanner input = new Scanner(System.in);
			do{
					System.out.println("No."+(j)+" student name?");
					name[j] = input.next();
					System.out.println("No."+(j)+" student ID?");
					stuID[j] = input.nextInt();
					System.out.println("No."+(j)+" student Korean score?");
					kor[j] = input.nextInt();
					System.out.println("No."+(j)+" student English score?");
					eng[j] = input.nextInt();
					System.out.println("No."+(j)+" student Math score?");
					mat[j] = input.nextInt();
				
				System.out.println("Insert 'and' to continue");
				ask = input.next();
				j++;			
			}while(endSign.equals(ask));		
			System.out.println("Score saved");
		
			//stmt3.execute("DELETE FROM examtable");
			int [] total = new int[100]; //각 사람의 총합
			int [] avg = new int[100];     //각 사람의 평균
			for(int i = 0; i < j; i++){ //각 사람의 총합
				total[i] = kor[i] + eng[i] +mat[i] ;
				avg[i] = total[i]/3;
			}				
			for(int i = 0; i < j; i++){
				//int kor = (int)Math.random() * 100;
				//int eng = (int)Math.random() * 100;
				//int mat = (int)Math.random() * 100;
			 stmt3.execute("INSERT INTO score(name, studentid, kor, eng, mat, total, average)" +""
			 		+ " VALUES('"+name[i]+"',"+stuID[i]+","+kor[i]+","+eng[i]+","+mat[i]+","+total[i]+","+avg[i]+");");
			// stmt3.execute("INSERT INTO examtable(name, studentid, kor, eng, mat)" +
						// "VALUES('apple,"+i+"',"+i+","+kor+","+eng+","+mat+");");
			}
			
			
			//ALTER TABLE examtable ADD total int   내용 추가
			//UPDATE examtable SET total = eng+kor+mat
			
			
			
			rset1.close();
			rset2.close();
			stmt1.close();
			stmt2.close();
			stmt3.close();
			conn1.close();
			conn2.close();
			conn3.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}	
}
