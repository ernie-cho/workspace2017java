import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class study 														//---------------A(study class)
{
		
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			MoneyChangeClass study = new MoneyChangeClass();
			System.out.println("USD " + study.exchange(5000, "USD")); 	// (5000, "USD")는 매게변수를 A(study class)의 B(exchange 매소드)를 호출하여 실행하라
			System.out.println();
			System.out.println("JPY " + study.exchange(5000, "JPY"));
			System.out.println();
			System.out.println("TWD " + study.exchange(5000, "TWD"));
			System.out.println();
			System.out.println("AUD " + study.exchange(5000, "AUD"));
			System.out.println();
		}
		catch(Exception e)
		{
			
		}
			
	}

}//public class study
