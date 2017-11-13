
public class class_1 {

	public static void main(String[] args) {
	//  Lec07, 조영도, 배열의 최대값 찾기
		//숫자 데이터가 있는 배열 생성
		int [] k20_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//반복문이 반복되면서 배열의 위치와 배열의 데이터를 출력함
		for(int k20_i=0;k20_i< k20_iArray.length; k20_i++) //배열의 개수 만큼 반복
			System.out.printf("k20_iArray[%d]=%d\n", k20_i,k20_iArray[k20_i]);//배열의 위치와 데이터를 출력함
		//배열의 최대 값 구하기
		int k20_iMax = k20_iArray[0]; //배열 선언 및 초기화
		int k20_iMaxPt = 0; //최대값의 위치 포인터
		for(int k20_i=0; k20_i<k20_iArray.length; k20_i++){ //배열의 개수 만큼 반복
			if(k20_iMax<k20_iArray[k20_i]){	//기존iMax과 새로운iArray값 비교
				k20_iMax = k20_iArray[k20_i];//기존 값보다 iArray값이 큰 경우 iMax에 새로운값 입력
				k20_iMaxPt=k20_i;//포인터 변수에 배열의 위치 값을 저장해둠
			}
		}
		//배열의 값을 모두 출력하고, 값중에 가장 큰 값을 MAX에 표시하며,자리수 또한 표시
		System.out.printf("MAX : iArray[%d]=%d\n", k20_iMaxPt,k20_iMax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
