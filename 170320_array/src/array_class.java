import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class array_class 
{

	public static void main(String[] args) 
	{
		try
		{
		OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //해당 경로에 output.csv 파일로 저장
		DataOutputStream dout = new DataOutputStream(out);
		
		
		int[][] score = new int[100][2];
		int number = 1;
		int question = 0;
		Scanner myInput = new Scanner(System.in);
		do
		{
			System.out.println(number + "번 학생의");
			System.out.println("영어 점수를 입력하세요 : ");
			score[number][0] = myInput.nextInt();
			System.out.println("수학 점수를 입력하세요 : ");
			score[number][1] = myInput.nextInt();
			number++;
			
			System.out.println("계속 입력 하시겠습니까? 계속 : 1 , 중단 : 2 ");
			question = myInput.nextInt();
		}
		while(question !=2);
		
		for(int i=0; i < number; i++) //출력
		{
			for(int j=0; j < 2; j++)
			{
				System.out.print(score[i][j] + "\t");	
			}
			System.out.println();
		}

		}//try
		
		catch(Exception e)
		{
			
		}//catch
		
		
		//Scanner myInput = new Scanner(System.in);
		/*
		//성적입력 출력
	try
	{
		OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //해당 경로에 output.csv 파일로 저장
		DataOutputStream dout = new DataOutputStream(out);
		
		int[] arr2 = new int[10];
		String[] arr = new String[100];
		String student = "";
		String printData ="";
		int score = 0;
		int input = 0;
		int count =0;
		String strData;
		strData = "이름" + "," + "점수" + "\n";
		out.write(strData.getBytes());
		
		do
		{			
			System.out.println("이름을 입력하세요 : ");
			arr[count] = myInput.next(); 
			System.out.println("점수는 몇점입니까? ");
			arr2[count] = myInput.nextInt(); 	
			System.out.println("계속 입력 하시겠습니까? 계속 : 1 , 중단 : 2 ");
			input = myInput.nextInt();
			count++;		
		}
		while (input == 1);
		
		for(int i = 0; i < count; i++)
		{
			printData= arr[i] +","+arr2[i] + "\n";
			out.write(printData.getBytes());		
		}		
		
		
		//
	}
	catch(Exception e)
	{
		
	}*/
		//2차원 배열
		/*
		try
		{
			OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //해당 경로에 output.csv 파일로 저장
			DataOutputStream dout = new DataOutputStream(out);
			
			int result=0, count=1;
			int arrTwo[][] = new int[100][2];
			int score=0;
			String strData;
			strData = "이름" + "," + "점수" + "\n";
			out.write(strData.getBytes());
			String student = "";
			int scoreKor = 0, scoreEng = 0, scoreMath = 0;
			int mathTotal = 0, korTotal = 0, engTotal = 0;
			int stuTotal = 0, stuAvg =0;
			int input = 0;
			
			
			
			int cnt = 0;  //학생 추가될 때 마다 카운트 증가함
			do
			{
				System.out.println("이름을 입력하세요(영어로)");
				student = myInput.next();  					//학생 이름 입력
				System.out.println("국어 점수를 입력하세요 : ");
				scoreKor = myInput.nextInt();				
				System.out.println("영어 점수를 입력하세요 : ");
				scoreEng = myInput.nextInt();
				//System.out.println("수학 점수를 입력하세요 : ");
				//scoreMath = myInput.nextInt();
				System.out.println("계속 입력 하시겠습니까? 계속 : 1 , 중단 : 2 ");
				input = myInput.nextInt();
					
				int arrTwo[][] = scoreKor+scoreEng; //scoreMath;   //학생  개인 총점
				stuAvg = stuTotal/2;					  //학생  개인 평균
				
				strData = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + "\n";   // 파일로 데이터 출력
				//strData = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + " " + "," + stuTotal + "," + stuAvg + "\n";   // 파일로 데이터 출력
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
		}
		catch (Exception e)
		{
			
			
		}
		
			
		   System.out.println("몇칸 몇줄로 입력할까요? : ");	
					result = myInput.nextInt(); 
					myInput.close();
					
					for(int i=0; i < result; i++)
					{
						for(int j=0; j < result; j++)
						{
							arrTwo[i][j] = count++; 
						}
					}
					
					for(int i=0; i < result; i++) //출력
					{
						for(int j=0; j < result; j++)
						{
							System.out.print(arrTwo[i][j] + "\t");	
						}
						System.out.println();
					}
			
			*/
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
