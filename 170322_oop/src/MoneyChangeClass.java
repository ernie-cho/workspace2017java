import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class MoneyChangeClass {
	public double exchange(double won, String targetName) 				//---------------B(exchange 매소드)
	{
		double result = 0;
		try
		{
			FileInputStream in = new FileInputStream("C:\\test\\exchange_Input.csv"); //해당 경로에 exchange_Input.csv 파일을 호출
			DataInputStream din = new DataInputStream(in);
			
			//String[] currency = new String[100];						//불러온 파일을 저장하기 위한 배열선언
			Double[] currency = new Double[100];						//불러온 파일을 저장하기 위한 배열선언
			String[] name = new String[100];
			int number = 0;												//불러온 파일행을 바꾸는 변수
			while(din.available() >0)									//파일안에 저장된 내용만큼 동작
			{
				String temp;											//파일안에 내용을 행으로 저장하기 위한 변수
				String[] temp_curr = new String[3];						//파일안의 내용을 따로 저장하기 위한 배열
				//Double[] temp_curr = new Double[3];						//파일안의 내용을 따로 저장하기 위한 배열
				temp = din.readLine();									//행으로 읽어서 temp에 저장
				temp_curr = temp.split(",");							//temp에 저장된것을 콤마(,)로 나눠서 배열에 저장
				
				for(int i = 0; i < 1; i++)								//1열에 저장된 값을 한번 실행하여  currency[number]에 저장 
				{
					//currency[number] = temp_curr[1];					//1열내용(exchange값만 저장)
					currency[number] = Double.parseDouble(temp_curr[1]);
				}

				number++;												//행 개행을 위한 증가시키기
				//System.out.println(number);
			}
			for(int i=0; i < number; i++)
			{
				if(name[i].equals(targetName) == true)
				{
					result = won / currency[i];
					break;
				}
			}
			
			
			//System.out.println(currency[number]);
			/*switch(targetName)											//아래 case내용을 계산하는것
			{
			case "USD" :
				result = won/Double.parseDouble(currency[0]);
				break;
			case "JPY" :
				result = won/Double.parseDouble(currency[1]);
				break;
			case "TWD" :
				result = won/Double.parseDouble(currency[2]);
				break;
			case "AUD" :
				result =won/Double.parseDouble(currency[3]);
				break;
			}*/
			in.close();
			din.close();
		}//try
		catch(Exception e)
		{
			
		}//catch	
		return result;
	}//public double exchange(double won, String targetName);
}
