import java.util.Scanner;

public class Thread_alarm2 implements Runnable{
	public void run(){
		int alarmTime = 0;
		Scanner myScan = new Scanner(System.in);
		System.out.println("���� �ڿ� �ι�° �˶��︱���?");
		alarmTime = myScan.nextInt();
	

			try{
			Thread.sleep(alarmTime*1000);
			System.out.println("**********�ι�° �˶��Դϴ� �Ͼ����**********");
			}
			catch (Exception e){
				
			}
		
		
	}
	
}
