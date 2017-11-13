/*import java.util.ArrayList;

public class K20_170526_4 {

	public static void main(String[] args) {
		//  Lec07, 조영도, Array List2 
		//  ArrayList를 임의의 숫자로 추가
		int k20_iTestMAX=1000000;
		k20_ArrayList k20_iAL = new ArrayList();
		
		for(int k20_i =0 ; k20_i < k20_iTestMAX; k20_i++)
			k20_iAL.add((int)(Math.random()*1000000));
		
		for(int k20_i =0 ; k20_i < k20_iAL.size() ; k20_i++)
			System.out.printf(" ArrayList %d = %d\n", k20_i, k20_iAL.get(k20_i));
		
		System.out.printf("********************************\n");
		k20_iAL.sort(null);
		
		for(int k20_i = 0 ; k20_i < k20_iAL.size() ; k20_i++)
			System.out.printf(" ArrayList %d = %d\n", k20_i, k20_iAL.get(k20_i));
	}

}
*/