import java.util.Scanner;

public class Calendar_170314 
{

	public static void main(String[] args) 
	{
// TODO 윤년 계산 프로그램
		Scanner mylnput = new Scanner(System.in);
		int inputYear = 0, month = 0, day = 0;
		int days =0, cnt =0;
		boolean check = false; //true 윤년, false 윤년아님
		int secMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ; //월 계산 배열
		System.out.println("Year : ");
		inputYear = mylnput.nextInt();
		if ((inputYear % 4 == 0 && inputYear % 100 !=0) || inputYear % 400 == 0)
		{
			check = true;
			secMonth[1] = 29;
		}
		else
		{
			check = false;
		}		
		System.out.println("month : ");
		month = mylnput.nextInt();
		System.out.println("day : ");
		day = mylnput.nextInt();
		
		days = (inputYear - 1900) *365; //몇년지났는가?
		switch(month)
		{		
		case 12:
			days += 30;
		case 11:
			days += 31;
		case 10:
			days += 30;
		case 9:
			days += 31;
		case 8:
			days += 31;
		case 7:
			days += 30;
		case 6:
			days += 31;
		case 5:
			days += 30;
		case 4:
			days += 31;
		case 3:
			days += 28;
		case 2:
			days += 31;
		case 1:
			days += 0;		
		}
		days += day - 1;		
		mylnput.close();
		if(check == true)
		{
			System.out.println("윤년입니다");
			System.out.println("1월 : 31일");
			System.out.println("2월 : 29일");
			System.out.println("3월 : 31일");
			System.out.println("4월 : 30일");
			System.out.println("5월 : 31일");
			System.out.println("6월 : 30일");
			System.out.println("7월 : 31일");
			System.out.println("8월 : 31일");
			System.out.println("9월 : 30일");
			System.out.println("10월 : 31일");
			System.out.println("11월 : 30일");
			System.out.println("12월 : 31일");
		}
		else if(check == false)
		{
			System.out.println("윤년이 아닙니다");
			System.out.println("1월 : 31일");
			System.out.println("2월 : 28일");
			System.out.println("3월 : 31일");
			System.out.println("4월 : 30일");
			System.out.println("5월 : 31일");
			System.out.println("6월 : 30일");
			System.out.println("7월 : 31일");
			System.out.println("8월 : 31일");
			System.out.println("9월 : 30일");
			System.out.println("10월 : 31일");
			System.out.println("11월 : 30일");
			System.out.println("12월 : 31일");
		}
		for(int i = 1900; i <= inputYear; i++)//1900년 부터 입력한 년도까지 윤년을 구하는 공식
		{
			if ((i % 4 == 0 && i % 100 !=0) || i % 400 == 0)
			{
				cnt++; //윤년 추가 저장
			}
		}
		int totalDay = 0, date = 0;
		String dayOfWeek = "일";
		totalDay = (days+cnt); //총 일수 계산
		System.out.println("1900년 1월 1일 부터 " + (totalDay) + "일 지났네요");
		if(check == true) //윤년 요일계산
		{
			date = totalDay % 7;
			date = date -1;
		}
		else 
		{
			date = totalDay % 7;
		}
		
		
		switch(date)
		{
			case 0:
				dayOfWeek = "월";
				break;
			case 1:
				dayOfWeek = "화";
				break;
			case 2:
				dayOfWeek = "수";
				break;
			case 3:
				dayOfWeek = "목";
				break;
			case 4:
				dayOfWeek = "금";
				break;
			case 5:
				dayOfWeek = "토";
				break;
			case 6:
				dayOfWeek = "일";
				break;
		}
		System.out.println(inputYear + "년 " + month +"월 " + day +"일은 " + dayOfWeek+"요일 입니다.");
		
		//System.out.println(inputYear + "년 " + month +"월");
		System.out.printf("\n\t\t%d년 %d월\n", inputYear, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int secDay = 0; //총 일수 - 입력한 날 + 1 = 해당 월의 1번째 날짜를 위치를 알려줌
		int secDate =0; //1일의 요일을 알려줌
		secDay = (totalDay - day)+1;
		secDate = secDay % 7; 
		//해당 월의 1일 위치를 파악하고 앞의 공백을 계산하여 토요일마다 줄 바꿈을 해줌
		int cnt2=0;	
		if(check == true)
		{
			for(int i = 0; i <= (secDate-1); i++)  //윤년일 때 공백 계산하는 공식
			{
				System.out.print("\t");
				cnt2++;				
			}		
		}
		else
		{
			//if(cnt2 % 7 != 0)
			{
				for(int i = 0; i < secDate+1; i++)  //공백 계산하는 공식
				{
					System.out.print("\t");
					cnt2++;
					if(cnt2 % 7 == 0)
					{
						System.out.println();
					}
						//System.out.println();
					
				}	
			}
		}		
		for(int j = 1; j <= secMonth[month-1]; j++) //날짜 표시 및 토요일 개행
		{
			System.out.print(j+"\t");
			cnt2++;
			if(cnt2 % 7 == 0)
			{
				System.out.println();
			}
		}	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
