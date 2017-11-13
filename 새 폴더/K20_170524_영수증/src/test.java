import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

	public static void main(String[] args) {
	
		//Emart������ ��� , 0524_Lec5_03, �賲��
		
		//��ǰ �̸� ���� �迭
		String [] k02_itemname = {"����� �ſ�� 4���� ��","������ new","��Ϲ���Ĩ 2Plus","Ģ��","�������ڳ�  1980�� ����","��īĨ�� ���� onion","������","����Ĩ","ĭ��","���ڱ�",
							  "�ø���","�ѼŻѼ� 5��/����","��������","�ٳ���ű �����","��ġ","������","��������","����","�������","ġ�佺",
							  "���Ͻ� �ٳ������ϱ� �ƴұ�","����ջ��� �԰�ʹ� ����","��Ű&ũ���� 4�� ������ ����� �����","��¡���","Ȩ���� 10���� ����","�Ƕ�",
							  "�����������۽�","��Ű","�����۽� �����������۽�","�ܲʹ��","�ܲʹ�� ������ 4������"};
		//��ǰ ���� ���� �迭
		int [] k02_price = {800,1500,2000,2500,3000,3500,4000,4500,5000,5500,
						6000,6500,7000,7500,8000,8500,9000,9500,10000,10500,
						11000,1150000,120000,12500,13000,13500,14000,14500,15000,15500,15000};
		//��ǰ ���� ���� �迭
		int [] k02_num = {2,4,6,8,10,1,3,5,7,9,
					  3,4,5,6,7,8,9,10,11,12,
					  10,9,8,7,6,5,4,3,2,1,2};
		//�鼼 ��ǰ ���� ���� �迭
		boolean [] k02_taxFree = {true,false,true,true,false,true,false,true,true,false,
							  true,false,true,true,false,true,false,true,true,false,
							  true,false,true,true,false,true,false,true,true,false,true};
		
		int k02_taxVal = 0;	//����(�� �� ��)
		int k02_no_tax = 0;	//�鼼 ��ǰ ���� �� ��
		int k02_total = 0;	//�� ���� �ݾ�
		int k02_nettax = 0;	//���� ��ǰ
		
		//3�ڸ� �� ���� ,��� ���� ����.
		DecimalFormat df = new DecimalFormat( "###,###,###,###,###" );
		//Calendar Ŭ������ ����Ͽ� ���� �ð��� ������.
		Calendar calt = Calendar.getInstance();
		//�ʿ��� ��¥ ���� ������ ��������.
		SimpleDateFormat ymd = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat hms = new SimpleDateFormat("HH:mm:ss");
		
		//������ ��� ����
		System.out.printf("%-5.5s %31.31s %15.15s\n", "emart","�̸�Ʈ ������","(031)888-1234");
		System.out.printf("%56.56s\n", "206-86-50913  �̰���");
		System.out.printf("%49.49s\n", "���ν� ������ �������552");
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-35.35s\n", "������ �������� ��ȯ/ȯ�� �Ұ�(30�ϳ�)");		
		System.out.printf("%-35.35s\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");	
		System.out.printf("%-35.35s\n", "üũī��/�ſ�ī�� û����� �ݿ���");	
		System.out.printf("%-35.35s\n", "�ִ� 3~5�� �ҿ� (�ָ�,����������)");
		System.out.printf("\n");
		//���� ��¥ ���
		System.out.printf("[%-3.3s]%10.10s %5.5s %35.35s\n", "�� ��", ymd.format(calt.getTime()), hms.format(calt.getTime()), "POS:0009-2418");
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-18.18s %13.13s %6.6s %10.10s\n", "    �� ǰ ��", "��  ��", "�� ��", "��  ��");
		System.out.printf("-----------------------------------------------------------\n");
		byte by[];
		//�Ǹ� ��ǰ ���
		for(int i = 0; i < k02_itemname.length; i++){
			String k02_input_str = ""; //���� ��ǰ�� ��� String
			//��ǰ ���� 18����Ʈ�ڸ� �ʰ��� ��� ���� �ڸ���
			k02_itemname[i] = k02_itemname[i].replaceAll("\t", "");
			k02_itemname[i] = k02_itemname[i].replaceAll("\n", "");
			k02_itemname[i] = k02_itemname[i].replaceAll("\r", "");
			
			if(k02_itemname[i].getBytes().length <= 18){	//���� ���� 18����Ʈ ������ ��� ���ڸ� �״�� ���
				k02_input_str = k02_itemname[i];
			}else{
				
				
				//���� ���� 18����Ʈ �ʰ��� ��� substring�� �̿��Ͽ� byte�� 18 �̻��϶������� ���.
				for(int j = 1; j < 18; j++){
					if(k02_input_str.getBytes().length >= 18){	//��ǰ���� ����Ʈ ���̰� 18�̻��̸� �ݺ����� ��������.
						break;
					}
					k02_input_str = k02_itemname[i].substring(0, j);  //��ǰ ���� ����Ʈ ���̰� 18�̻��� �� ������ ���ڸ� ������.
				}
				
			}
			
			//��ǰ�� ��� ����Ʈ ���� 20����Ʈ���� ������ " " ���ڷ� 20����Ʈ���� �߰�.
			if(k02_input_str.getBytes().length < 20){
				while(true){
					if(k02_input_str.getBytes().length >= 20){	//��ǰ���� ����Ʈ ���̰� 20 �̻��ΰ�� �ݺ����� ����������.
						break;
					}
					k02_input_str +=  " ";	//����Ʈ ���� �����Ҷ����� ���鹮�� �߰�.
				}
			}
					
			String k02_str_i = String.format("%02d", i+1);	//ǰ�� ���� ���� ����
			if (k02_taxFree[i]){	//�鼼 ��ǰ�� ���
									//�鼼 ��ǰ�� ��쿡�� ǳ�� ���� �ڿ� *�� �߰����ش�.
			System.out.printf("%-4.4s%10s %12.12s %8.8s %12.12s\n",
					//������ ���信 ���缭 ����Ѵ�.
					String.valueOf(k02_str_i)+"*", k02_input_str, df.format(k02_price[i]), df.format(k02_num[i]), df.format(k02_price[i]*k02_num[i]));
			k02_no_tax = k02_no_tax + (k02_price[i]*k02_num[i]);	//�鼼 ��ǰ ���� ����
			}	
			else{	//���� ��ǰ�� ���.
					//���� ��ǰ�� ��� ǰ�� ���� �ڿ� *�� �߰����� �ʴ´�.
			System.out.printf("%-4.4s%10s %12.12s %8.8s %12.12s\n", 
					//������ ���信 ���缭 ����Ѵ�.
					String.valueOf(k02_str_i), k02_input_str, df.format(k02_price[i]), df.format(k02_num[i]), df.format(k02_price[i]*k02_num[i]));
			}
			k02_total = k02_total + (k02_price[i]*k02_num[i]);	//�� ���� �ݾ� ����
		}
		
		k02_nettax = (int)((k02_total-k02_no_tax) / 1.1);	//���� ��ǰ ���� ���
		k02_taxVal = k02_total-k02_no_tax-k02_nettax;			//�ΰ��� �ݾ� ���
		System.out.printf("%41.41s %13.20s\n", "(*)�� ��  �� ǰ", df.format(k02_no_tax));	//�鼼 ��ǰ ���� ���
		System.out.printf("%41.41s %13.20s\n", "�� ��  �� ǰ", df.format(k02_nettax));		//���� ��ǰ ���� ���
		System.out.printf("%42.42s %13.20s\n", "��   ��   ��", df.format(k02_taxVal));		//�� ���� �߿� �ΰ��� ���� ���
		System.out.printf("%43.43s %13.20s\n", "��        ��", df.format(k02_total));		//�� �ݾ� �� ���
		System.out.printf("%-28.28s %24.24s\n", "�� �� �� �� �� ��", df.format(k02_total));	//���� ��� �ݾ� ���
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-4.4s %5.5s %46.46s\n", "0024", "��  ��", "5417**8890/07850246");
		System.out.printf("%-7.7s %44.44s\n", "ī�����", "�Ͻú� /"+df.format(k02_total));	//�Ͻúҷ� �����ϴ� �ݾ� ���
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-30.30s", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		
	}
}






















