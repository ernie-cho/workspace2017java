import java.util.Scanner;

public class busan {

	public static void main(String[] args) 
	{
		// https://www.slideshare.net/deview/d2-campus-alcall
		/*
//1�� ���� (�� �� A�� B�� �Է¹��� ����, A���� B������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(0<=A<B<=100)
		Scanner mylnput = new Scanner(System.in);
		
		int numA=0, numB=0, result =0;
		System.out.println("A�� B�� �Է��ϼ���");
		System.out.println("��, (0<=A<B<=100) ������ �����ؾ��մϴ�.");
		numA = mylnput.nextInt();
		numB = mylnput.nextInt();
		for(int i =0 ; i < numB; i++)
		{
			result += numA+i; //ù��° �� + numB������ ���� Ƚ����� +1��ŭ ������Ű�� ����
		}
		//result += numA + numB;
		System.out.println("�Է��Ͻ� "+numA+"���� "+numB+"������ ���� "+result+"�Դϴ�.");*/
//2�� ���� �� ����� �̸��� ȹ ���� ������ ��ġ�ϰ�, �� ���� ����ϱ�
		Scanner mylnput = new Scanner(System.in);
		int n = 0;
		
		System.out.println("�� ��� �̸��� ���̸� �Է��ϼ���:");
		n = mylnput.nextInt();

		int nameA[] = new int[n];
		int nameB[] = new int[n];
		int nameC[] = new int[n];
		int nameD[] = new int[n];
		System.out.println("�� ��� �̸��� ȹ���� �����Ͽ� �Է��ϼ���.");
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

	
		int j = 0;								//���� 
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
