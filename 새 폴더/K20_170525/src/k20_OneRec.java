
	//  Lec07, 조영도, 클래스의 배열 성적표용 클래스
	public class k20_OneRec { //클래스 생성
		private String k20_name; //학생 이름
		private int k20_kor; //언어 점수 
		private int k20_eng; //영어 점수
		private int k20_mat; //수학 점수
		private int k20_student_id;//학생 아이디
		
		public k20_OneRec(int k20_student_id ,String k20_name, int k20_kor,
							int k20_eng,int k20_mat){
			    this.k20_student_id = k20_student_id;
				this.k20_name = k20_name;
				this.k20_kor = k20_kor;
				this.k20_eng = k20_eng;
				this.k20_mat = k20_mat;
		}
		public int k20_student_id(){return this.k20_student_id;};
		public String k20_name(){return this.k20_name;};
		public int k20_kor(){return this.k20_kor;};
		public int k20_eng(){return this.k20_eng;};
		public int k20_mat(){return this.k20_mat;};
		public int sum(){return this.k20_kor+this.k20_eng+this.k20_mat;};
		public double ave(){return this.sum()/3.0;};
		}
		
		
		
		
		
		
		
		
		
		
		
