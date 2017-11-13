import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class class_170314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//예외코드
	/*	int a = 10;
		int b = 0;
		int c = 0, result=0;
		
		Scanner myIn = new Scanner(System.in);
		
		try
		{
			b = myIn.nextInt();
			c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("0이외의 숫자를 입력하세요");	
			result = 1;
		}
		catch(InputMismatchException e)
		{
			System.out.println("정수를 입력하세요");	
			result = 1;
		}
		finally //예외여부에 관계없이 실행되는 로직
		{
			System.out.println("알 수 없는 오류");
		}
		
		if(result == 0)
		{
			System.out.println("결과는" +c);
			System.out.println("정상!!");
		}
		myIn.close();
	*/
//입장권을 이용한 예외코드
	/*	int a = 0;
		Scanner myInput = new Scanner(System.in);
		System.out.println("1. 자유이용권, 2. 입장권");
		try
		{
			a = myInput.nextInt();
			if( a < 1 || a > 2)
			{
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("입력오류입니다");
		}
		catch(Exception e)
		{
			
		}
	*/
//삼항연산자
	/*	int result = 0;
		int a = 10;
		int b = 20;
		result = (a> b) ? 1 : 2;
		System.out.println(result);
	*/
//가위, 바위, 보 게임
		String result;
		Scanner myScan = new Scanner(System.in);
		System.out.println("가위, 바위, 보 게임");
		System.out.print("하나를 입력하세요: ");
		result = myScan.nextLine();
		//System.out.print(result);//임시로 출력해보기
			
		Random rand = new Random();
		int randNum = Math.abs(rand.nextInt()% 3);
		//System.out.println(randNum);
		
		if(result.equals("가위"))
		{
			result = "0";
		}
		else if(result.equals("바위"))
		{
			result = "1";
		}
		else if(result.equals("보"))
		{
			result = "2";
		}
		
		if(randNum == 0)
		{
			if(result == "0")
			{
				System.out.println("비겼습니다");
			}
			else if(result == "1")
			{
				System.out.println("당신이 이겼습니다");
			}
			else if(result == "2")
			{
				System.out.println("컴퓨터가 이겼습니다");
			}
		}
		else if(randNum == 1)
		{
			if(result == "0")
			{
				System.out.println("컴퓨터가 이겼습니다");
			}
			else if(result == "1")
			{
				System.out.println("비겼습니다");
			}
			else if(result == "2")
			{
				System.out.println("당신이 이겼습니다");
			}
		}
		else if(randNum == 2)
		{
			if(result == "0")
			{
				System.out.println("당신이 이겼습니다");
			}
			else if(result == "1")
			{
				System.out.println("컴퓨터가 이겼습니다");
			}
			else if(result == "2")
			{
				System.out.println("비겼습니다");
			}
		}
		
		//System.out.print(result);//임시로 출력해보기
		
		
		
		
		
		
		
		
	}
}
