package baekjoon;

import java.util.Scanner;

public class array_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=0, B=0, C=0;
		long result = 0;
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		result = A*B*C;
		
		String strResult = String.valueOf(result);

		String[] arrayResult = new String[strResult.length()];
		int[] cntResult = new int[10];
		
		
		
		for(int i = 0; i < strResult.length(); i++){
			arrayResult[i] =  strResult.substring(i, i+1);
		}
		//배열의 길이만큼 돌면서 하나씩 비교
		for(int i = 0; i< arrayResult.length ;i++){
			switch(Integer.parseInt(arrayResult[i])){
				case 0:
					cntResult[0]++;
					break;
				case 1:	
					cntResult[1]++;
					break;
				case 2:
					cntResult[2]++;
					break;
				case 3:	
					cntResult[3]++;
					break;
				case 4:
					cntResult[4]++;
					break;
				case 5:	
					cntResult[5]++;
					break;
				case 6:
					cntResult[6]++;
					break;
				case 7:	
					cntResult[7]++;
					break;
				case 8:	
					cntResult[8]++;
					break;
				case 9:
					cntResult[9]++;
					break;
				
			}
		}
		for(int i=0; i< cntResult.length;i++){
		System.out.println(cntResult[i]);
		}
		
		
	}

}
