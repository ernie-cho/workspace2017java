import java.text.DecimalFormat;

public class K20_170525_1 {

	public static void main(String[] args) {
		// TODO �޸����� (replaceAll)
		// �޸� ������ ������ ���� ����
		// ���ڿ� integer�� �ٲٱ�
		// ����߸��Ȱ� ��� ���� ���
	//  Lec07, ������, �������̿��� �ʵ� ����
			String [] k20_OneRec ={ //������ ����� �迭
			"01*  ���ڿ���180ml*4              3,780         1         3,780",
			"02*  BE���座Ʈ15F-16BK           1,500         2         3,000",
			"03   (G)�⺻����4-7               200         1           200",
			"04*  ������� 2.3L                9,500         1         9,500",
			"05   �׸� �����ͽ�95g*8           5,980         1         5,980",
			"06*  �ϸ� ġŲ�ʰ�480+1          10,000         1        10,000",
			"07   �η��������Ϻ긮          13,500         1        13,500",
			"08*  �ٳ�������� 240ml           5,900         2        11,800",
			"09   ��������Ŷ312.5G           2,980         1         2,980",
			"10*  Ǯ���� ġ��&ġ��            47,000         2        94,000",
			"11*  ��)HG ��������� 2           9,900         2        19,800",
			"12   ������ ���� �ް���          14,400         1        14,400",
			"13*  Ŀ�Ǹ����� 240ml*4           4,250         1         4,250",
			"14   Ʈ���� �����ѻ���            2,700         1         2,700",
			"15   ��귣�� ����ä��            9,800         3        29,400",
			"16   ��ŰǪ��Ŀ���͵�2            2,980         1         2,980",
			"17*  �����������̾�����           2,500         2         5,000",
			"18*  �޸��ٿ����ٸ���          10,130         1        10,130",
			"19   �����ֵ��ī����             4,060         1         4,060",
			"20*  �����ڵ��������20           3,900         1         3,900",
			"21*  �õ���纣��1.13kg           1,240         1         1,240",
			"22   ���̱�ġ���̱�ġ         1,000         2         2,000",
			"23*  �������5000ml 3����         8,500         1         8,500",
			"24*  û�ۻ�� 5��/��              9,800         1         9,800",
			"25*  ���ǹ���Ƽ R��BLACK          9,900         1         9,900",
			"26   DWƮ��ġ��ƮNAVYS           10,000         1        10,000",
			"27   ġŰŸ ���������̾�          5,400         1         5,400",
			"28   ���                         5,400         1         5,400",
			"29*  ����                         1,200         3         3,600",
			"30   Ǯ��������                     500         1           900",
			"31*  �ٳ����䱸��Ʈ                 400         3         1,200",
			"32*  ������ĵĿ��                 1,500         1         1,500",
			"33   ���̽�������6����*3N        10,000         1        10,000",
			"34*  ����������Ǹſ��           1,500         1         1,500",
			"35   ����Ʈ ����                  2,750         2         5,500"};
			
			for(int k20_i = 0; k20_i < k20_OneRec.length ; k20_i++ ){//�ݺ��� �ȿ��� ����� ���� �غ�� ����Line, Update���� ���
				//���ڿ� -> integer ��ȯ & �޸� ���� & ������ ���� ����
				int k20_price = Integer.parseInt( (new String(k20_OneRec[k20_i].getBytes(),32,7)).replaceAll(",","").trim());//�ݾ�
				int k20_num = Integer.parseInt( (new String(k20_OneRec[k20_i].getBytes(),45,4)).replaceAll(",","").trim());//����
				int k20_total = Integer.parseInt( (new String(k20_OneRec[k20_i].getBytes(),54,9)).replaceAll(",","").trim());//����
				//���ڿ��� ����ϱ� ���� String
				String errName =(new String(k20_OneRec[k20_i].getBytes(),5,20)).replaceAll(",","").trim();//����-�����۸�
				String errPrice =(new String(k20_OneRec[k20_i].getBytes(),32,7)).replaceAll(",","").trim();//����-�ݾ�
				String errNum =(new String(k20_OneRec[k20_i].getBytes(),45,4)).replaceAll(",","").trim();//����-�������� 
				String errTotal =(new String(k20_OneRec[k20_i].getBytes(),54,9)).replaceAll(",","").trim();//����-���չ���
				//����� ������ ���� �� ������ ���� ����ϰ�, ������
				if(k20_total != k20_price * k20_num){ //������ �ݾ�*������ �ƴ� ��
					System.out.printf("=========================\n");//���м� ���
					System.out.printf("Error Line -> ["+k20_i+"] \n");//������ ���� ���
					System.out.printf(errName+" ");//�����߻��� �����۸�
					System.out.printf(errPrice+" * ");//�����߻��� �ݾ�
					System.out.printf(errNum+" = ");//�����߻��� ����
					System.out.println(errTotal);//�����߻��� ����
					System.out.printf("=========================\n");//���м� ���
					System.out.printf("Update Line -> ["+k20_i+"] \n");//������ ���� ���
					System.out.printf(errName+" ");//������ �����۸� ���
					System.out.printf(k20_price+" * ");//������ �ݾ����
					System.out.printf(k20_num+" = ");//������ ���� ���
					System.out.println(k20_price*k20_num);//������ �ݾ� ���
					System.out.printf("=========================\n");//���м� ���
					
				}
			}
			
	}

}
