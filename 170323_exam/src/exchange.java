import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class exchange 
{

	public static void main(String[] args) 
	{
		double result = 0; //use double not int
		try
		{
			FileInputStream in = new FileInputStream("C:\\test\\input.csv"); 	//해당 경로에 input.csv 파일을 호출
			DataInputStream din = new DataInputStream(in);					 	//DataInputStream은 혼자서 쓸수 없고 FileInputStream의 도움을 받아야한다			
			FileOutputStream out = new FileOutputStream("C:\\test\\output.csv");//해당 경로에 output.csv 파일로 저장
			DataOutputStream dout = new DataOutputStream(out);
	
			Scanner myInput = new Scanner(System.in); 							 //입력변수
			int moneyWon =0;
			Double lastResult ;
			double changed =0;
			String nationalCode = null;
			int row =0, col=0;
			int more = 0; //계속할건지를 저장함
			String nameofNation = null;										//입력된 국가코드를 임시로 저장
			Double[] save = new Double[100];								//입력된 환율만 저장하는 배열
			String[] saveNational = new String[100];						//입력된 국가코드만 저장하는 배열
			Double[] currency = new Double[100];							//환율을 저장하는 배열
			String[] national = new String[100];							//나라코드를 저장하는 배열
			int count = 0;
			int count2= 0;													//결과값 저장하는 배열의 카운트
			while (din.available() >0)	
			{
				String temp;												//파일안에 내용을 행으로 저장하기 위한 변수
				String[] temp_curr = new String[3];							//파일안의 내용을 따로 저장하기 위한 배열
				temp = din.readLine();										//행으로 읽어서 temp에 저장
				temp_curr = temp.split(",");								//temp에 저장된것을 콤마(,)로 나눠서 배열에 저장
				
				for(int i = 0; i < 1; i++)									//1열에 저장된 값을 한번 실행하여  currency[count]에 저장 
				{
					national[count] = (temp_curr[0]);						//0열내욜을 national배열에 저장			
					currency[count] = Double.parseDouble(temp_curr[1]);		//1열내용(exchange값만 저장)
				}
				count++;
				
		
			}//while
			for(int i = 0; i < 4 ; i++) 									//콘솔에 찍어보기
			{		
				System.out.print(national[i] + "\t");						//input파일에 있는 나라코드 출력해보기
				System.out.print(currency[i] + "\t");						//input파일에 있는 환율 출력해보기
				System.out.println();
			}
			
			
			while(true)														//사용자 입력받기
			{
				System.out.print("환율 계산을 위한 원화 금액을 입력하세요 : ");				 
				moneyWon = myInput.nextInt();								//원화 입력 받기
				System.out.print("변환할 국가 코드를 입력하세요 : ");					//국가코드 입력 받기
				nationalCode = myInput.next();

				System.out.print("추가 하시겠습니까? (1:Yes, 2:No)");
				more = myInput.nextInt();
				
				for(int i =0;i <count; i++) 								//배열을 검색하여 같은 값을 찾아서 출력, equal(string)
				{
					if(national[i].equals(nationalCode) == true)
					{
						result = moneyWon * currency[i];					//입력한 won과 현재환율을 곱하여 값을 저장함
						nameofNation = national[i];							//입력한 국가코드를 임시로 저장함
						break;												//같은것을 찾았기 때문에 해당for문만 빠져나온다
					}
				}
				saveNational[count2] = nameofNation;						//임시저장된 국가코드를 입력된 국가코드 배열에 순서대로 저장함
				save[count2] = result;										//result값을 save배열에 저장하여 입력 될때 마다 저장함
				count2++;													//save배열을 카운트증가시킴
	
				
				if(more == 2)
				{
					for(int i = 0; i < row; i++) 								//콘솔에 찍어보기
					{		
							System.out.print(currency[i] + "\t");
							lastResult = currency[i];			
					}
					System.out.println("파일에 저장되었습니다");
					break;
				}
			}//while(true)	
			for(int i = 0; i < count2; i++)
			{
				System.out.print(saveNational[i]);			//콘솔에 국가코드 배열의 최종 결과값을 출력함
				System.out.println("\t" + save[i]);					//콘솔에 save배열의 최종 결과값을 출력함
			}
			
			
			
			//여기에 입력하는 변수와 최종csv에 저장하는 코드 작성
			
			
			
			

				
				 
		din.close();
		dout.close();
		}//try
		
		catch(Exception e)
		{
			
		}//catch(Exception e)
		return;
	}//public static void main(String[] args) 

}//public class exchange 
