
	//  Lec07, ������, Ŭ������ �迭 ����ǥ�� Ŭ����
	public class k20_OneRec { //Ŭ���� ����
		private String k20_name; //�л� �̸�
		private int k20_kor; //��� ���� 
		private int k20_eng; //���� ����
		private int k20_mat; //���� ����
		private int k20_student_id;//�л� ���̵�
		
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
		
		
		
		
		
		
		
		
		
		
		
