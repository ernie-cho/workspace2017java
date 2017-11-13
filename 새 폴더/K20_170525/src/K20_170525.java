//  Lec07, ������, ��/�� ���� ä��� & �ѱ� ī��Ʈ
public class K20_170525 {
		//���ڿ� & ���� �Էµ�
	public static String HanBlankForeword (String k20_str, int k20_blank){
		// �ݺ������� ���� ���̸� ����Ͽ� ���� ������ ������ �Է�
		for(int k20_i = k20_str.getBytes().length; k20_i < k20_blank; k20_i++) { 
			k20_str = " " + k20_str; //���� �߰�
        }
		
		return k20_str; //������ ��������� ��ȯ���� (����)
		
	}
		//���ڿ� & ���� �Էµ�
	public static String HanBlankBackword (String k20_str, int k20_blank){
		// �ݺ������� ���� ���̸� ����Ͽ� ���� ������ ������ �Է�
		for(int k20_i = k20_str.getBytes().length; k20_i < k20_blank; k20_i++) { 
			k20_str = k20_str +" "; //���� �߰�
        }
		return k20_str;//������ ��������� ��ȯ���� (������)
			
	}
	    //�ѱ� ���� Count�ϱ�
	public static int HanCount (String k20_str){
		int k20_length = 0;//�ѱ��� ���� �� ī��Ʈ�� ����
		String k20_words = "";//���ڸ� �߶� ������ ����
		//�ݺ������� ���ڸ� �߶��ֱ�
		for(int k20_i = 0; k20_i < k20_str.length(); k20_i++){
			k20_words = k20_str.substring(k20_i,k20_i+1);//���ڸ� �ϳ��� �ڸ�
			if( k20_words.getBytes().length == 2){//�ڸ� ���ڰ� 2byte���
				k20_length++;//�ѱ۷� �ν��Ͽ� ī��Ʈ�� ������Ŵ
			}
		}return k20_length;
		
	}                                      
	     //��� ��¿� main
	public static void main(String[] args) {
		//��� ������ 15�� �ְ�, �����͸� �������� ��ġ�ϱ� ���� �����ʿ� ������ �߰���Ŵ
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("�ѱ�abcd",15));  //����������1
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("�ѱ��ѱ�aa",15));//����������2 
		//��� ������ 15�� �ְ�, �����͸� ���������� ��ġ�ϱ� ���� ���ʿ� ������ �߰���Ŵ
		System.out.printf("HanBlankBackword[%s]\n",HanBlankBackword("�ѱ�ab",15));    //��������1
		System.out.printf("HanBlankBackword[%s]\n",HanBlankBackword("�ѱ��ѱ�aa",15));//��������2
		//�Է� �Ǿ��ִ� �����Ϳ� �ѱ��� 2byte�� �ν��Ͽ� �� ������ �����
		System.out.printf("�ѱ��� [%d]��\n",HanCount("���� �ٶ�abcd����  ��efg"));	   //�ѱ� ���� ī��Ʈ	

	}

}
