import java.util.Scanner;

public class Calendar_170314 
{

	public static void main(String[] args) 
	{
// TODO ���� ��� ���α׷�
		Scanner mylnput = new Scanner(System.in);
		int inputYear = 0, month = 0, day = 0;
		int days =0, cnt =0;
		boolean check = false; //true ����, false ����ƴ�
		int secMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ; //�� ��� �迭
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
		
		days = (inputYear - 1900) *365; //��������°�?
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
			System.out.println("�����Դϴ�");
			System.out.println("1�� : 31��");
			System.out.println("2�� : 29��");
			System.out.println("3�� : 31��");
			System.out.println("4�� : 30��");
			System.out.println("5�� : 31��");
			System.out.println("6�� : 30��");
			System.out.println("7�� : 31��");
			System.out.println("8�� : 31��");
			System.out.println("9�� : 30��");
			System.out.println("10�� : 31��");
			System.out.println("11�� : 30��");
			System.out.println("12�� : 31��");
		}
		else if(check == false)
		{
			System.out.println("������ �ƴմϴ�");
			System.out.println("1�� : 31��");
			System.out.println("2�� : 28��");
			System.out.println("3�� : 31��");
			System.out.println("4�� : 30��");
			System.out.println("5�� : 31��");
			System.out.println("6�� : 30��");
			System.out.println("7�� : 31��");
			System.out.println("8�� : 31��");
			System.out.println("9�� : 30��");
			System.out.println("10�� : 31��");
			System.out.println("11�� : 30��");
			System.out.println("12�� : 31��");
		}
		for(int i = 1900; i <= inputYear; i++)//1900�� ���� �Է��� �⵵���� ������ ���ϴ� ����
		{
			if ((i % 4 == 0 && i % 100 !=0) || i % 400 == 0)
			{
				cnt++; //���� �߰� ����
			}
		}
		int totalDay = 0, date = 0;
		String dayOfWeek = "��";
		totalDay = (days+cnt); //�� �ϼ� ���
		System.out.println("1900�� 1�� 1�� ���� " + (totalDay) + "�� �����׿�");
		if(check == true) //���� ���ϰ��
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
				dayOfWeek = "��";
				break;
			case 1:
				dayOfWeek = "ȭ";
				break;
			case 2:
				dayOfWeek = "��";
				break;
			case 3:
				dayOfWeek = "��";
				break;
			case 4:
				dayOfWeek = "��";
				break;
			case 5:
				dayOfWeek = "��";
				break;
			case 6:
				dayOfWeek = "��";
				break;
		}
		System.out.println(inputYear + "�� " + month +"�� " + day +"���� " + dayOfWeek+"���� �Դϴ�.");
		
		//System.out.println(inputYear + "�� " + month +"��");
		System.out.printf("\n\t\t%d�� %d��\n", inputYear, month);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int secDay = 0; //�� �ϼ� - �Է��� �� + 1 = �ش� ���� 1��° ��¥�� ��ġ�� �˷���
		int secDate =0; //1���� ������ �˷���
		secDay = (totalDay - day)+1;
		secDate = secDay % 7; 
		//�ش� ���� 1�� ��ġ�� �ľ��ϰ� ���� ������ ����Ͽ� ����ϸ��� �� �ٲ��� ����
		int cnt2=0;	
		if(check == true)
		{
			for(int i = 0; i <= (secDate-1); i++)  //������ �� ���� ����ϴ� ����
			{
				System.out.print("\t");
				cnt2++;				
			}		
		}
		else
		{
			//if(cnt2 % 7 != 0)
			{
				for(int i = 0; i < secDate+1; i++)  //���� ����ϴ� ����
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
		for(int j = 1; j <= secMonth[month-1]; j++) //��¥ ǥ�� �� ����� ����
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
