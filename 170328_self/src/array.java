import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("몇칸 몇줄로 입력할까요?");
		Scanner myScan = new Scanner(System.in);
		int input = myScan.nextInt();
		int cnt = 1;
		int[][] print = new int[input][input];
		
			for(int i = 0; i < input; i++){ //배열안에 값을 저장하는 부분
				for(int j = 0; j<input; j++){
				  print[i][j] = cnt;
				  cnt++;
				}
				
			}
	
			for(int i = 0; i < input; i++){ //배열안에 값을 출력하는 부분
				for(int j = 0; j<input; j++){
				  
					System.out.print("\t" + print[i][j]);
				}
				System.out.println();
			}
			
			grade array = new grade(); //첫번째 알람
			array.gradeApp();
			
			
			
			
			
			
			
			
			
			
	}

}
