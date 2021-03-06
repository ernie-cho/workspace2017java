
package code;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class code  
{

	public static void main(String[] args) 
	{
		try
		{
			OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //해당 경로에 output.csv 파일로 저장
			DataOutputStream dout = new DataOutputStream(out);
			Scanner myInput = new Scanner(System.in);
			
			String student = "";
			int scoreKor = 0, scoreEng = 0, scoreMath = 0;
			int mathTotal = 0, korTotal = 0, engTotal = 0;
			int stuTotal = 0, stuAvg =0;
			int input = 0;
		
			String strData;
			
			//dataStr = "과 목" + "," + "국 어" + "," + "영 어" + "," + "수 학" + "\n";
			strData = "과 목" + "," + "국 어" + "," + "영 어" + "," + "수 학" + "," + " "+ "," + "개인총합"+ "," + "개인평균" + "\n";
			out.write(strData.getBytes());
			
			int cnt = 0;  //학생 추가될 때 마다 카운트 증가함
			do
			{
				System.out.println("이름을 입력하세요(영어로)");
				student = myInput.next();  					//학생 이름 입력
				System.out.println("국어 점수를 입력하세요 : ");
				scoreKor = myInput.nextInt();				
				System.out.println("영어 점수를 입력하세요 : ");
				scoreEng = myInput.nextInt();
				System.out.println("수학 점수를 입력하세요 : ");
				scoreMath = myInput.nextInt();
				System.out.println("계속 입력 하시겠습니까? 계속 : 1 , 중단 : 2 ");
				input = myInput.nextInt();
					
				stuTotal = scoreKor+scoreEng+scoreMath;   //학생  개인 총점
				stuAvg = stuTotal/3;					  //학생  개인 평균
				
				//dataStr = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + "\n";   // 파일로 데이터 출력
				strData = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + " " + "," + stuTotal + "," + stuAvg + "\n";   // 파일로 데이터 출력
				out.write(strData.getBytes());
				
				korTotal += scoreKor;		//국어 점수 총합
				engTotal += scoreEng;		//영어 점수 총합
				mathTotal += scoreMath;		//수학 점수 총합
				
				cnt++;	
			}
			while ( input == 1 );
			
			strData = "\r\n" + "과목 총점" + "," + korTotal + "," + engTotal +"," + mathTotal + "\n";
			out.write(strData.getBytes());
			strData = "과목 평균" + "," + korTotal/cnt + "," + engTotal/cnt +"," + mathTotal/cnt + "\n";
			out.write(strData.getBytes());
			
			myInput.close();
			out.close();			
		}
		catch(Exception e)
		{
	
		}
	
	}

}

