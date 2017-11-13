import java.util.Scanner;

public class java170313_2 {
	
	static int freeD_old = 52000, freeD_young = 45000, freeD_child = 41000, freeD_baby = 13000; //자유 1일권
	static int free4_old = 41000, free4_young = 36000, free4_child = 32000, free4_baby = 13000; //자유 After4
	static int passD_old = 36000, passD_young = 32000, passD_child = 29000;					   //입장권 1일권
	static int pass4_old = 30000, pass4_young = 27000, pass4_child = 24000;					   //입장권 After4
	static int pass7_old = 18000, pass7_young = 16000, pass7_child = 14000;					   //입장권 After7

	public static void main(String[] args) {
		// TODO 롯데월드 입장권 구매하기
										/*권종을 선택하세요.
										1. 자유이용권
										2. 입장권
										
										티켓 구분을 선택하세요.
										1. 1일권
										2. After4
										3. After7
										
										나이를 입력하세요.
										
										몇장을 주문하시겠습니까?
												
										우대사항을 선택하세요.
										1. 없음
										2. 장애인
										3. 국가유공자
										
										가격은 원입니다.
										감사합니다.
										============로떼월드===========
										자유이용권(1일권) 어른 X2 104000원
										=============================*/

		int ticketType = 0, ticket = 0, age = 0, ageType = 0, cnt = 0, discnt = 0, result = 0, price = 0;
		int totalPrice = 0;
		
		Scanner mylnput = new Scanner(System.in);
		
		System.out.println("권종을 선택하세요.");	//권종선택
		System.out.println("1. 자유이용권");
		System.out.println("2. 입장권");
		ticketType = mylnput.nextInt();
		
		if (ticketType == 1)
		{
			System.out.println("티켓 구분을 선택하세요."); //자유이용권의 세부 입장권선택
			System.out.println("1. 1일권");
			System.out.println("2. After4");
			ticket = mylnput.nextInt();
		}
		else if (ticketType == 2)
		{
			System.out.println("티켓 구분을 선택하세요."); //입장권의 세부 입장권선택
			System.out.println("1. 1일권");
			System.out.println("2. After4");
			System.out.println("3. After7");
			ticket = mylnput.nextInt();
		}
		System.out.println("나이를 입력하세요."); 		//나이 입력
		age = mylnput.nextInt();
		if (age >= 65) 
		{		 // 경로
			ageType = 0;
		}
		else if (age > 18) 
		{		 // 어른
			ageType = 1;
		}
		else if (age > 13)
		{	 	// 청소년
			ageType = 2;
		}
		else if (age > 3) 
		{		 // 어린이
			ageType = 3;
		}
		else 
		{		 // 베이비
			ageType = 4;
		}
		System.out.println("몇장을 주문하시겠습니까?");	//구매 장수 입력
		cnt = mylnput.nextInt();
		if (ticketType == 1)
		{  // 자유이용권				
			if (ticket == 1)	 // 자유이용권의 1일권
			{ // 1일권
				switch (ageType)
				{
				case 1: // 어른
					price = freeD_old;
					result = 1;
					break;
				case 2: // 청소년
					price = freeD_young;
					result = 2;
					break;
				case 0: // 경로
				case 3: // 어린이
					price = freeD_child;
					result = 3;
					break;
				case 4: // 베이비
					price = freeD_baby;
					result = 4;
					break;
				default :
					System.out.println("입력오류");
					break;
				}
			}
			if (ticket == 2)	 // 자유이용권의 1일권
			{ // 1일권
				switch (ageType)
				{
				case 1: // 어른
					price = free4_old;
					result = 1;
					break;
				case 2: // 청소년
					price = free4_young;
					result = 2;
					break;
				case 0: // 경로
				case 3: // 어린이
					price = free4_child;
					result = 3;
					break;
				case 4: // 베이비
					price = free4_baby;
					result = 4;
					break;
				default :
					System.out.println("입력오류");
					break;
				}
			}
			else
			{
				System.out.println("입력오류 직원을 불러주세요");
			}
		}
		else if (ticketType == 2) //입장권
		{
			if (ticket == 1) // 입장권의 1일권
			{ // 1일권
				switch (ageType)
				{
				case 1: // 어른
					price = passD_old;
					result = 9;
					break;
				case 2: // 청소년
					price = passD_young;
					result = 10;
					break;
				case 0: // 경로
				case 3: // 어린이
					price = passD_child;
					result = 11;
					break;
				default:
					System.out.println("아기(0~3세) 무료!!");
					result = 18;
					break;
				}
			}
			else if (ticket == 2) // 입장권의 After4
			{
				switch (ageType)
				{
				case 1: // 어른
					price = pass4_old;
					result = 12;
					break;
				case 2: // 청소년
					price = pass4_young;
					result = 13;
					break;
				case 0: // 경로
				case 3: // 어린이
					price = pass4_child;
					result = 14;
					break;
				default:
					System.out.println("아기(0~3세) 무료!!");
					result = 18;
					break;
				}
			}
			else if (ticket == 3) // 입장권의 After7
			{
				switch (ageType)
				{
				case 1: // 어른
					price = pass7_old;
					result = 15;
					break;
				case 2: // 청소년
					price = pass7_young;
					result = 16;
					break;
				case 0: // 경로
				case 3: // 어린이
					price = pass7_child;
					result = 17;
					break;
				default:
					System.out.println("아기(0~3세) 무료!!");
					result = 18;
					break;
				}
			}

		}
		totalPrice = (price*cnt);
		System.out.println("기본 가격은 "+ totalPrice +"원입니다.");
		System.out.println("가격 우대사항을 선택 하세요.\n");
		System.out.println("1. 없음\n");
		System.out.println("2. 장애인 우대\n");
		System.out.println("3. 국가유공자\n");
		discnt = mylnput.nextInt();
		if (discnt == 1)
		{
			totalPrice = totalPrice;
		}
		else if (discnt == 2)
		{
			totalPrice = (totalPrice * 7) / 10;
		}
		else if (discnt == 3)
		{
			totalPrice = totalPrice / 2;
		}
		else
		{
			System.out.println("1,2,3번중에 선택하세요\n\n");
		}
		
		System.out.println("======================로떼  월드===================");
		if (result == 1)  // 자유이용권의 1일권
		{
			System.out.println("자유이용권(1일권)"	+"\t\t" +"어른  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 2)
		{
			System.out.println("자유이용권(1일권)"	+"\t\t" +"청소년  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 3)
		{
			System.out.println("자유이용권(1일권)"	+"\t\t" +"경로,어린이  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 4)
		{
			System.out.println("자유이용권(1일권)"	+"\t\t" +"아기  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 5)  // 자유이용권의 after4
		{
			System.out.println("자유이용권(After4)"	+"\t\t" +"어른  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 6)
		{
			System.out.println("자유이용권(After4)"	+"\t\t" +"청소년  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 7)
		{
			System.out.println("자유이용권(After4)"	+"\t\t" +"경로,어린이  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 8)
		{
			System.out.println("자유이용권(After4)"	+"\t\t" +"아기  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 9) // 입장권의 1일권
		{
			System.out.println("입장권(1일권)"	+"\t\t" +"어른  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 10)
		{
			System.out.println("입장권(1일권)"	+"\t\t" +"청소년  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 11)
		{
			System.out.println("입장권(1일권)"	+"\t\t" +"경로,어린이  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 12)  // 입장권의 After4
		{
			System.out.println("입장권(After4)"	+"\t\t" +"어른  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 13)
		{
			System.out.println("입장권(After4)"	+"\t\t" +"청소년  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 14)
		{
			System.out.println("입장권(After4)"	+"\t\t" +"경로,어린이  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 15)  // 입장권의 After7
		{
			System.out.println("입장권(After7)"	+"\t\t" +"어른  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 16)
		{
			System.out.println("입장권(After7)"	+"\t\t" +"청소년  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 17)
		{
			System.out.println("입장권(After7)"	+"\t\t" +"경로,어린이  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else if (result == 18)
		{
			System.out.println("입장권"	+"\t\t" +"베이비  x" + cnt + "\t\t" +totalPrice +"원");
		}
		else
		{
			System.out.println("계산이 안되었습니다 직원에게 문의해주세요\n\n");
		}
		System.out.println("======================감사합니다===================\n\n");
		
		
		
		
		
		
		
		
		
		
	}

}













