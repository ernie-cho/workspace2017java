

public class Thread_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread alarm2 = new Thread(new Thread_alarm()); //ù��° �˶�
		alarm2.start();
		
		Thread alarm3 = new Thread(new Thread_alarm2()); //�ι�° �˶�
		alarm3.start();
		
		Thread alarm4 = new Thread(new Thread_alarm3()); //����° �˶�
		alarm4.start();
		
		Thread test1 = new Thread(new Thread1());		//������Դϴ�
		test1.start();
		
	}

}
