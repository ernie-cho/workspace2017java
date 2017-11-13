
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class works170317{

	public static void main(String[] args) {
		try{
			OutputStream out = new FileOutputStream("C:\\code\\output.csv");
			DataOutputStream dout = new DataOutputStream(out);
			Scanner myInput = new Scanner(System.in);
			
			String name = "";
			int scoreKor = 0, scoreEng = 0, scoreMath = 0;
			int mathTotal = 0, korTotal = 0, engTotal = 0;
			int contin = 0;
			
			String dataStr;
			
		
			dataStr = "이름" + "," + "국어" + "," + "영어" + "," + "수학" + "\n";
			out.write(dataStr.getBytes());
			
			int i = 0;
			do{
				System.out.println("이름을 입력하세요 : ");
				name = myInput.next();
				System.out.println("국어 점수를 입력하세요 : ");
				scoreKor = myInput.nextInt();
				System.out.println("영어 점수를 입력하세요 : ");
				scoreEng = myInput.nextInt();
				System.out.println("수학 점수를 입력하세요 : ");
				scoreMath = myInput.nextInt();
				System.out.println("계속 입력 하시겠습니까? Yes : 1 , No : 2 ");
				contin = myInput.nextInt();
				
				dataStr = name + "," + scoreKor + "," + scoreEng + "," + scoreMath + "\n";
				out.write(dataStr.getBytes());
				
				korTotal += scoreKor;
				engTotal += scoreEng;
				mathTotal += scoreMath;			
				i++;
				
			}while ( contin == 1 );			
			dataStr = "\n" + "총 점" + "," + korTotal + "," + engTotal +"," + mathTotal + "\n";
			out.write(dataStr.getBytes());
			dataStr = "평 균" + "," + korTotal/i + "," + engTotal/i +"," + mathTotal/i + "\n";
			out.write(dataStr.getBytes());		
			myInput.close();
			out.close();
			
		}catch(Exception e){
			
			
		}

		
	}

}