
public class class_1 {

	public static void main(String[] args) {
	//  Lec07, ������, �迭�� �ִ밪 ã��
		//���� �����Ͱ� �ִ� �迭 ����
		int [] k20_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//�ݺ����� �ݺ��Ǹ鼭 �迭�� ��ġ�� �迭�� �����͸� �����
		for(int k20_i=0;k20_i< k20_iArray.length; k20_i++) //�迭�� ���� ��ŭ �ݺ�
			System.out.printf("k20_iArray[%d]=%d\n", k20_i,k20_iArray[k20_i]);//�迭�� ��ġ�� �����͸� �����
		//�迭�� �ִ� �� ���ϱ�
		int k20_iMax = k20_iArray[0]; //�迭 ���� �� �ʱ�ȭ
		int k20_iMaxPt = 0; //�ִ밪�� ��ġ ������
		for(int k20_i=0; k20_i<k20_iArray.length; k20_i++){ //�迭�� ���� ��ŭ �ݺ�
			if(k20_iMax<k20_iArray[k20_i]){	//����iMax�� ���ο�iArray�� ��
				k20_iMax = k20_iArray[k20_i];//���� ������ iArray���� ū ��� iMax�� ���ο �Է�
				k20_iMaxPt=k20_i;//������ ������ �迭�� ��ġ ���� �����ص�
			}
		}
		//�迭�� ���� ��� ����ϰ�, ���߿� ���� ū ���� MAX�� ǥ���ϸ�,�ڸ��� ���� ǥ��
		System.out.printf("MAX : iArray[%d]=%d\n", k20_iMaxPt,k20_iMax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
