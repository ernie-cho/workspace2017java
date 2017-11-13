
public class k20_realMain {

	public static void main(String[] args) {
		Main01.dataSet();	  //데이터 생성 된 것 호출
		Main01.dataSort();	  //데이터를 합계로 정렬함
		Main01.HeaderPrint(); //헤더 프린트한 것 호출
		//배열의 사이즈만큼 반복함 
		for(int k20_i = 1; k20_i <= Main01.k20_ArrayOneRec.size(); k20_i++){
			Main01.ItemPrint(k20_i-1); //내용 반복해서 호출
			
			//꼬리 출력
			//조건=데이터의 개수가 30으로 떨어지거나, 데이터의 마지막에서
			if(k20_i % Main01.k20_page_person == 0 || k20_i == Main01.k20_ArrayOneRec.size()){
			
			Main01.TailPrint();//현재, 누적 페이지 출력
			Main01.count_person = 0; //현재 사람수 초기화
			System.out.printf("\n");//공백 출력
			}
			//헤더 출력하기
			if(k20_i % Main01.k20_page_person == 0 ){ //헤더 출력하기
				if(k20_i == Main01.k20_ArrayOneRec.size()){
					//데이터의 마지막이면 헤더가 필요없으므로 실행안함
				}else {
					Main01.HeaderPrint(); //헤더 프린트한 것 호출
				}
			}
		}
		
		  
	}
}
