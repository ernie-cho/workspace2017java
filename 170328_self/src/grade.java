import java.util.Scanner;

public class grade {

	public void gradeApp(){
		
		
	Scanner myScan = new Scanner(System.in);	
	int []engScore = new int[100];
	int [] mathScore= new int[100];	
	int inputCnt =0;
	int contin = 0;
	int i = 0;
	System.out.print("����� �Է��Ͻðڽ��ϱ�?");
	inputCnt = myScan.nextInt();
	do{
		
		System.out.println((i+1) +"�� �л���");
		System.out.print("���� ������ �����Դϱ�?");
		engScore[i] = myScan.nextInt();
		System.out.print("���� ������ �����Դϱ�?");
		mathScore[i] = myScan.nextInt();
		 i++;
		 System.out.print("�߰� �Է� �Ͻðڽ��ϱ�? (1.�߰� 2.����)");
		 contin = myScan.nextInt();
		 
		
		}
	while(contin != 2);
		 
		
	for(int j =0; j <inputCnt ; j++)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
