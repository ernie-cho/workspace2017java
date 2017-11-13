import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = null;
		int eng = 0, math = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn1 =DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/Exam2", "root", "dudeh123");
			Statement stmt1 = conn1.createStatement();
			int studentid = 0;
			while(true){
				//입력부분
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
					if(name.toLowerCase().equals("end")){//end입력되면 프로그램 종료
						break;
					}
				System.out.println("학번 입력 : ");
				studentid = sc.nextInt();
				System.out.println("영어 점수 입력 : ");
				eng = sc.nextInt();
				System.out.println("수학 점수 입력 : ");
				math = sc.nextInt();
				sc.nextLine();//마지막에 엔터를 한번 인식하기 때문에 이것을 해줌
				
				//입력받은 데이터를 데이터베이스에 추가
				stmt1.execute("INSERT INTO score (studentid, name, eng, math, total, ave) VALUES("
						+ studentid + "," +
						"'" + name + "'," +
						eng + "," +
						math + "," +
						(eng+math) + "," +
						((eng+math)/2) +");"
						);
				
				
				//출력부분
				System.out.println("이름\t영어\t수학\t총점\t평균");
				//데이터베이스 출력
				ResultSet rset1 = stmt1.executeQuery("select * from score;");//뭔가 쏘고 답을 받는게 쿼리 그냥 execte하면 보내기만 하는거
				while (rset1.next()){
					//결과물 처리
					System.out.println(rset1.getString(2) + "\t" + rset1.getInt(3)+ "\t" +rset1.getInt(4)
							+ "\t" +rset1.getInt(5)+ "\t" +rset1.getInt(6));
				}
				//전체 합
				rset1 = stmt1.executeQuery("select sum(eng), sum(math) from score;");
				rset1.next();
				System.out.println("합\t" + rset1.getString(1) + "\t" + rset1.getString(2));
				
				//전체평균
				rset1 = stmt1.executeQuery("select avg(eng), avg(math) from score;");
				rset1.next();
				System.out.println("평균\t" + rset1.getString(1) + "\t" + rset1.getString(2));
				
				
				
				
				rset1.close();
				
			}//while(true)
			stmt1.close();
			conn1.close();
		}//try
		catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}//public static void main(String[] args)

}//public class exam2
