import java.util.Scanner;

public class Thread_alarm2 implements Runnable{
	public void run(){
		int alarmTime = 0;
		Scanner myScan = new Scanner(System.in);
		System.out.println("몇초 뒤에 두번째 알람울릴까요?");
		alarmTime = myScan.nextInt();
	

			try{
			Thread.sleep(alarmTime*1000);
			System.out.println("**********두번째 알람입니다 일어나세요**********");
			}
			catch (Exception e){
				
			}
		
		
	}
	
}
