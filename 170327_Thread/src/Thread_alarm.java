import java.util.Scanner;

public class Thread_alarm implements Runnable{
	public void run(){
		int alarmTime = 0;
		Scanner myScan = new Scanner(System.in);
		System.out.println("���� �ڿ� �˶��︱���?");
		alarmTime = myScan.nextInt();
		

			try{
			Thread.sleep(alarmTime*1000);
			System.out.println("**********ù��° �˶��Դϴ� �Ͼ����**********");
			}
			catch (Exception e){
				
			}
		
		
	}
	
}
