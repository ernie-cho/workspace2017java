
public class k20_realMain {

	public static void main(String[] args) {
		Main01.dataSet();	  //������ ���� �� �� ȣ��
		Main01.dataSort();	  //�����͸� �հ�� ������
		Main01.HeaderPrint(); //��� ����Ʈ�� �� ȣ��
		//�迭�� �����ŭ �ݺ��� 
		for(int k20_i = 1; k20_i <= Main01.k20_ArrayOneRec.size(); k20_i++){
			Main01.ItemPrint(k20_i-1); //���� �ݺ��ؼ� ȣ��
			
			//���� ���
			//����=�������� ������ 30���� �������ų�, �������� ����������
			if(k20_i % Main01.k20_page_person == 0 || k20_i == Main01.k20_ArrayOneRec.size()){
			
			Main01.TailPrint();//����, ���� ������ ���
			Main01.count_person = 0; //���� ����� �ʱ�ȭ
			System.out.printf("\n");//���� ���
			}
			//��� ����ϱ�
			if(k20_i % Main01.k20_page_person == 0 ){ //��� ����ϱ�
				if(k20_i == Main01.k20_ArrayOneRec.size()){
					//�������� �������̸� ����� �ʿ�����Ƿ� �������
				}else {
					Main01.HeaderPrint(); //��� ����Ʈ�� �� ȣ��
				}
			}
		}
		
		  
	}
}
