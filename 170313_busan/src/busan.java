import java.util.Scanner;

public class busan {

	public static void main(String[] args) 
	{
		// https://www.slideshare.net/deview/d2-campus-alcall
		/*
//1번 문제 (두 수 A와 B를 입력받은 다음, A부터 B까지의 합을 출력하는 프로그램을 작성하시오.
		//(0<=A<B<=100)
		Scanner mylnput = new Scanner(System.in);
		
		int numA=0, numB=0, result =0;
		System.out.println("A와 B를 입력하세요");
		System.out.println("단, (0<=A<B<=100) 조건을 만족해야합니다.");
		numA = mylnput.nextInt();
		numB = mylnput.nextInt();
		for(int i =0 ; i < numB; i++)
		{
			result += numA+i; //첫번째 수 + numB까지의 수의 횟수대로 +1만큼 증가시키고 저장
		}
		//result += numA + numB;
		System.out.println("입력하신 "+numA+"부터 "+numB+"까지의 합은 "+result+"입니다.");*/
//2번 문제 두 사람의 이름의 획 수를 교차로 배치하고, 그 합을 계산하기
		Scanner mylnput = new Scanner(System.in);
		int n = 0;
		
		System.out.println("두 사람 이름의 길이를 입력하세요:");
		n = mylnput.nextInt();

		int nameA[] = new int[n];
		int nameB[] = new int[n];
		int nameC[] = new int[n];
		int nameD[] = new int[n];
		System.out.println("두 사람 이름의 획수를 교차하여 입력하세요.");
	for (int i = 0; i < n; i++)
	{	
		nameA[i] = mylnput.nextInt(); 
	}
	for(int i = 0; i < n; i++)
	{
		System.out.print(nameA[i]+" ");
	}
	System.out.println(" ");
	System.out.println("=========== ");

	
		int j = 0;								//계산식 
		for(int i = 0; i < n; i++)
		{
			 nameB[i]= nameA[i]+nameA[j];		
			j++;	
		}
		for(int i = 0; i < n-1; i++)
		{
			System.out.print(nameB[i]+1+" ");	
		}
		System.out.println(" ");
		int k = 0;
		for(int i = 0; i < n; i++)
		{
			 nameC[i]= nameB[i]+nameB[k];		
			k++;	
		}
		for(int i = 1; i < n-1; i++)
		{
			System.out.print(nameC[i]+" ");	
		}
		System.out.println(" ");
		int l = 0;
		for(int i = 0; i < n; i++)
		{
			 nameD[i]= (nameC[i]+nameC[l]);		
			l++;	
		}
		for(int i = 0; i < n-2; i++)
		{
			System.out.print(nameD[i]+" ");	
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
