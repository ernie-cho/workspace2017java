
public class Thread1 implements Runnable {
	
	public void run(){
		//for(int i = 0; i <100; i++)
		while(true){
			try{
				Thread.sleep(1000);
				System.out.println("계산중입니다...");		
			}
			catch (Exception e){
		
			}
		}
		
	}

}
