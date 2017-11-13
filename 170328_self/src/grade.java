import java.util.Scanner;

public class grade {

	public void gradeApp(){
		
		
	Scanner myScan = new Scanner(System.in);	
	int []engScore = new int[100];
	int [] mathScore= new int[100];	
	int inputCnt =0;
	int contin = 0;
	int i = 0;
	System.out.print("몇명을 입력하시겠습니까?");
	inputCnt = myScan.nextInt();
	do{
		
		System.out.println((i+1) +"번 학생의");
		System.out.print("영어 점수는 몇점입니까?");
		engScore[i] = myScan.nextInt();
		System.out.print("수학 점수는 몇점입니까?");
		mathScore[i] = myScan.nextInt();
		 i++;
		 System.out.print("추가 입력 하시겠습니까? (1.추가 2.종료)");
		 contin = myScan.nextInt();
		 
		
		}
	while(contin != 2);
		 
		
	for(int j =0; j <inputCnt ; j++)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
