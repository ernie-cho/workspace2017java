import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ĭ ���ٷ� �Է��ұ��?");
		Scanner myScan = new Scanner(System.in);
		int input = myScan.nextInt();
		int cnt = 1;
		int[][] print = new int[input][input];
		
			for(int i = 0; i < input; i++){ //�迭�ȿ� ���� �����ϴ� �κ�
				for(int j = 0; j<input; j++){
				  print[i][j] = cnt;
				  cnt++;
				}
				
			}
	
			for(int i = 0; i < input; i++){ //�迭�ȿ� ���� ����ϴ� �κ�
				for(int j = 0; j<input; j++){
				  
					System.out.print("\t" + print[i][j]);
				}
				System.out.println();
			}
			
			grade array = new grade(); //ù��° �˶�
			array.gradeApp();
			
			
			
			
			
			
			
			
			
			
	}

}
