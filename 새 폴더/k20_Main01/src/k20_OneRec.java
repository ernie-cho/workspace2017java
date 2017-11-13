
	//  Lec07, 조영도, 클래스의 배열 성적표용 클래스
	public class k20_OneRec { 		 //클래스 생성
		private String k20_name; 	 //학생 이름
		private int k20_kor; 		 //언어 점수 
		private int k20_eng; 		 //영어 점수
		private int k20_mat; 		 //수학 점수
		private int k20_student_id;//학생 아이디
		/*생성자 생성*/
		public k20_OneRec(int k20_student_id ,String k20_name, 
				int k20_kor,int k20_eng,int k20_mat){
			    this.k20_student_id = k20_student_id;//학생 ID
				this.k20_name = k20_name;			 //학생 이름
				this.k20_kor = k20_kor;				 //언어 점수
				this.k20_eng = k20_eng;				 //영어 점수
				this.k20_mat = k20_mat;				 //수학 점수
		}
		/*데이터 출력용 메소드*/
		public int k20_student_id(){return this.k20_student_id;};  //학생 ID	
		public String k20_name(){return this.k20_name;};				//학생 이름
		public int k20_kor(){return this.k20_kor;};					//언어 점수
		public int k20_eng(){return this.k20_eng;};					//영어 점수
		public int k20_mat(){return this.k20_mat;};					//수학 점수
		public int k20_sum(){return this.k20_kor+this.k20_eng+this.k20_mat;};//합계
		public int k20_ave(){return this.k20_sum()/3;};				//평균
		}
		
		
		
		
		
		
		
		
		
		
		
