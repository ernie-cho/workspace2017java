import java.util.ArrayList;

public class K20_170526_3 {

	public static void main(String[] args) {
		//  Lec07, 조영도, Array List 실습하기
		ArrayList k20_iAL = new ArrayList();
		 
		k20_iAL.add("abc");		/*문자열 샘플*/
		k20_iAL.add("abcd");	/*문자열 샘플*/
		k20_iAL.add("efga");	/*문자열 샘플*/
		k20_iAL.add("가나다0"); /*문자열 샘플*/
		k20_iAL.add("1234");	/*문자열 샘플*/
		k20_iAL.add("12rk12");  /*문자열 샘플*/
		
		System.out.printf("********************************\n"); /*구분선 넣기*/
		System.out.printf(" 시작 ArraySize %d \n", k20_iAL.size()); /*배열 크기*/
		for(int k20_i=0; k20_i < k20_iAL.size() ; k20_i++) /*배열 크기 만큼 반복*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.set(3, "가라라라"); /*3번의 내용을 변경함*/
		System.out.printf("********************************\n"); /*구분선 넣기*/
		System.out.printf(" 내용변경 ArraySize %d \n", k20_iAL.size());/*배열 크기*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*배열 크기 만큼 반복*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.remove(4); /*4번의 내용을 삭제하고 5번의 내용이 채워짐*/
		System.out.printf("********************************\n"); /*구분선 넣기*/
		System.out.printf(" 내용변경 ArraySize %d \n", k20_iAL.size());/*배열 크기*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*배열 크기 만큼 반복*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.sort(null);/*정렬 숫자,알파벳,한글*/
		System.out.printf("********************************\n"); /*구분선 넣기*/
		System.out.printf(" 리스트Sort ArraySize %d \n", k20_iAL.size());/*배열 크기*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*배열 크기 만큼 반복*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.clear();/*내용 모두 삭제*/
		System.out.printf("********************************\n"); /*구분선 넣기*/
		System.out.printf(" 전부 삭제 ArraySize %d \n", k20_iAL.size());/*배열 크기*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*배열 크기 만큼 반복*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		
		
		
		
		
		
	}

}
