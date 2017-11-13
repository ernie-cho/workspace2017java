

public class Thread_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread alarm2 = new Thread(new Thread_alarm()); //첫번째 알람
		alarm2.start();
		
		Thread alarm3 = new Thread(new Thread_alarm2()); //두번째 알람
		alarm3.start();
		
		Thread alarm4 = new Thread(new Thread_alarm3()); //세번째 알람
		alarm4.start();
		
		Thread test1 = new Thread(new Thread1());		//계산중입니다
		test1.start();
		
	}

}
