import java.util.ArrayList;

public class K20_170526_3 {

	public static void main(String[] args) {
		//  Lec07, ������, Array List �ǽ��ϱ�
		ArrayList k20_iAL = new ArrayList();
		 
		k20_iAL.add("abc");		/*���ڿ� ����*/
		k20_iAL.add("abcd");	/*���ڿ� ����*/
		k20_iAL.add("efga");	/*���ڿ� ����*/
		k20_iAL.add("������0"); /*���ڿ� ����*/
		k20_iAL.add("1234");	/*���ڿ� ����*/
		k20_iAL.add("12rk12");  /*���ڿ� ����*/
		
		System.out.printf("********************************\n"); /*���м� �ֱ�*/
		System.out.printf(" ���� ArraySize %d \n", k20_iAL.size()); /*�迭 ũ��*/
		for(int k20_i=0; k20_i < k20_iAL.size() ; k20_i++) /*�迭 ũ�� ��ŭ �ݺ�*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.set(3, "������"); /*3���� ������ ������*/
		System.out.printf("********************************\n"); /*���м� �ֱ�*/
		System.out.printf(" ���뺯�� ArraySize %d \n", k20_iAL.size());/*�迭 ũ��*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*�迭 ũ�� ��ŭ �ݺ�*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.remove(4); /*4���� ������ �����ϰ� 5���� ������ ä����*/
		System.out.printf("********************************\n"); /*���м� �ֱ�*/
		System.out.printf(" ���뺯�� ArraySize %d \n", k20_iAL.size());/*�迭 ũ��*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*�迭 ũ�� ��ŭ �ݺ�*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.sort(null);/*���� ����,���ĺ�,�ѱ�*/
		System.out.printf("********************************\n"); /*���м� �ֱ�*/
		System.out.printf(" ����ƮSort ArraySize %d \n", k20_iAL.size());/*�迭 ũ��*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*�迭 ũ�� ��ŭ �ݺ�*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		k20_iAL.clear();/*���� ��� ����*/
		System.out.printf("********************************\n"); /*���м� �ֱ�*/
		System.out.printf(" ���� ���� ArraySize %d \n", k20_iAL.size());/*�迭 ũ��*/
		for(int k20_i =0; k20_i < k20_iAL.size(); k20_i++)/*�迭 ũ�� ��ŭ �ݺ�*/
			System.out.printf(" ArrayList %d = %s\n", k20_i, k20_iAL.get(k20_i));
		
		
		
		
		
		
		
	}

}
