import java.util.Scanner;

public class java170313 
{

	public static void main(String[] args) 
	{
/*		System.out.print("하이~!!3");
		System.out.println("안녕하세요~!!");*/
		
/*		int sum = 0;
		for(int i=0; i <= 10; i++){
			sum = sum +i;
		}
		System.out.println("합은" + sum + "입니다.");*/
		
/*																		//연습문제 -구구단 출력-	
		for(int i = 2 ; i <= 9; i++)
		{
			System.out.println("===" + i +"단" +"===");
			for(int j = 1; j <=9; j++)
			{
			System.out.println(i +"*" +j+ "=" +i*j);			
			}
		}
*/
																		//C언어 연습문제 -영수증 만들기-
/*	
		System.out.println("--------------------------------------");
		System.out.println("메뉴"+"\t\t\t수량"+"\t     금액");
		System.out.println("--------------------------------------");
		System.out.println("[]A-1 하교"+"\t\t4"+"\t35,200");
		System.out.println("[]A-3 구채교"+"\t\t11"+"\t96,800");
		System.out.println("[]A-2 소매"+"\t\t5"+"\t42,000");
		System.out.println("[]A-4 소롱포"+"\t\t6"+"\t52,800");
		System.out.println("[]A-5 파채교"+"\t\t5"+"\t40,000");
		System.out.println("[]A-6 XO장의 소포"+"\t\t4"+"\t30,000");
		System.out.println("[]A-8 봉성선육교"+"\t\t4"+"\t32,000");
		System.out.println("[]A-7 간증우육"+"\t\t4"+"\t32,000");
		System.out.println("[]A-10 백화교"+"\t\t4"+"\t32,000");
		System.out.println("[]C-3 망치춘권"+"\t\t4"+"\t35,200");
		System.out.println("[]탄탄면"+"\t\t\t2"+"\t20,000");
		System.out.println("--------------------------------------");
		System.out.println("소  계"+"       \t\t\t451,200");	
		System.out.println("합  계"+"       \t\t\t451,200");
		System.out.println("--------------------------------------");
*/
/*		
																		//C언어 연습문제 -입출력 만들기-
		//다음과 같이 A,B,C 세 개의 숫자를 입력받아, 다음을 계산하는 프로그램을 작성하시오.
		//A, B, C 각 숫자가 짝수이면 0, 홀수이면 1 출력, A, B, C 값의 합, 차, 곱 출력
		
		Scanner mylnput = new Scanner(System.in);
		int inputA, inputB, inputC, resultSum, resultMinus, resultMul;
		System.out.print("A를 입력");
		inputA = mylnput.nextInt();
		System.out.print("B를 입력");
		inputB = mylnput.nextInt();
		System.out.print("C를 입력");
		inputC = mylnput.nextInt();
		System.out.println("A는 "+inputA);
		System.out.println("B는 "+inputB);
		System.out.println("C는 "+inputC);
		
		System.out.println("A의 짝/홀 확인 : "+inputA%2);
		System.out.println("B의 짝/홀 확인 : "+inputB%2);
		System.out.println("C의 짝/홀 확인 : "+inputC%2);
		resultSum = inputA+inputB+inputC;
		resultMinus = inputA-inputB-inputC;
		resultMul  = inputA*inputB*inputC;
		System.out.println("A + B + C = "  + inputA + "+" +inputB + "+" +inputC+"=" + resultSum);
		System.out.println("A - B - C = "  + inputA + "-" +inputB + "-" +inputC+"=" + resultMinus);
		System.out.println("A * B * C = "  + inputA + "*" +inputB + "*" +inputC+"=" + resultMul);
*/	
																		//연습문제 두개의 정수를 입력받아 평균과 성적내기
/*		
		Scanner mylnput = new Scanner(System.in);
		int num1, num2, avg;
		System.out.println("성적 두개를 입력하세요 : ");
		num1 = mylnput.nextInt();
		num2 = mylnput.nextInt();
		System.out.println("입력하신 성적은 " + num1 +" "+ num2 +"입니다.");
		avg = (num1+num2)/2;
																		//if else if으로 해보기
		if (90 < avg && avg <= 100)
		{
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 A입니다.");
			
		}
		else if (80 < avg && avg <= 90)
		{
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 B입니다.");
		}
		else if (70 < avg && avg <= 80)
		{
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 C입니다.");
		}
		else if (60 < avg && avg <= 70)
		{
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 D입니다.");
		}
		else if (avg < 59)
		{
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 F입니다.");
		}
		else
		{
			System.out.println("입력범위 초과");
		}
		
																		//switch case로 해보기
		switch (avg/10)
		{
		case 10:
		case 9:
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 D입니다.");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("당신의 평균은 " + avg +"이며, 학점은 F입니다.");
			break;
		default:
			System.out.println("입력범위 초과");
			break;
		}
*/

/*																		//구구단 1~10단까지 출력 (단 3의 배수인 단은 출력하지 않기)
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("===" + i +"단" +"===");
			if(i % 3 == 1 || i % 3 == 2)
			{
				for(int j = 1; j < 10; j++)
				{
					System.out.println(i + "*" + j +"=" +i*j);
				}
			}
			else
			{
				System.out.println("출력안함");
			}
			
		}
*/
/*																	//While문(1~100까지 출력하면서, 3의 배수만 따로 표시해주기)
	int num = 0 ;
		while(num <=100)
		{
			if(num % 3 == 0)
			{
			System.out.println(num +"<---3의 배수");
			}
			else
			{
				System.out.println(num);
			}
			num++;
		}
*/
/*																	//연습문제 입력받고 출력하기
		Scanner mylnput = new Scanner(System.in);
		String input;
		boolean bool;
		int inputNum;
		byte byteNum;
		short shortNum;
		long longNum;
		float floatNum;
		double doubleNum;
		System.out.println("당신의 이름은?");
		input = mylnput.nextLine();
		System.out.println("당신의 이름은"+input+"입니다.");
		
		System.out.println("당신의 나이는?");
		inputNum = mylnput.nextInt();
		System.out.println("당신의 나이는"+inputNum+"입니다.(숫자만 입력)");
		
		System.out.println("boolean값을 입력하세요 : ");
		bool = mylnput.nextBoolean();
		System.out.println("입력한 boolean 값은"+bool+"입니다.");
		
		System.out.println("byte 값을 입력하세요 : ");
		byteNum = mylnput.nextByte();
		System.out.println("입력한 byte 값은" + byteNum +"입니다.");
		
		System.out.println("Short 값을 입력하세요 : ");
		shortNum = mylnput.nextShort();
		System.out.println("입력한 Short 값은" + shortNum +"입니다.");
		
		System.out.println("long 값을 입력하세요 : ");
		longNum = mylnput.nextLong();
		System.out.println("입력한 long 값은" + longNum +"입니다.");
		
		System.out.println("float 값을 입력하세요 : ");
		floatNum = mylnput.nextFloat();
		System.out.println("입력한 float 값은" + floatNum +"입니다.");
		
		System.out.println("double 값을 입력하세요 : ");
		doubleNum = mylnput.nextDouble();
		System.out.println("입력한 double 값은" + doubleNum +"입니다.");
		
*/																			//계산기 (0입력시 계산기 종료)
/*
		int num1 = 0, num2, result = 0;
		String oper;
		Scanner mylnput = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("계산식을 입력하세요.(0입력시 종료)");
			num1 = mylnput.nextInt();
			if (num1 == 0)
			{
				System.out.println("종료합니다.");
			}
			mylnput.nextLine();						//이중 엔터 방지용
			oper = mylnput.nextLine(); 	//equals
			num2 = mylnput.nextInt();
			if (num1 != 0)
			{
				if(oper.equals("+"))
				{
					result = num1 + num2;
				}
				else if (oper.equals("-"))
				{
					result = num1 - num2;
				}
				else if (oper.equals("*"))
				{
					result = num1 * num2;
				}
				else if (oper.equals("/"))
				{
					result = num1 / num2;
				}
			}System.out.println(num1+ oper+ num2 +"=" + result);
		}
		
		*/
		
		
		
		
		
		
		
		
	}

}