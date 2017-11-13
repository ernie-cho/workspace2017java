//������ ���  Lec05_02, ������
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class K20_170524_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lecture5 page8 -----------------------important
		//
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//�ݾ� ���� ���� ����
		GregorianCalendar k20_calender = new GregorianCalendar();//��¥ ���ϱ� �Լ�
		SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss"); // ����Ͻú� ����
		String k20_itemname[] = {"Ǯ��������","�ٳ����䱸��Ʈ","���۱���Ʈī��","������ĵĿ��"};//��ǰ�� �迭
		String k20_itemcode[] = {"8809169718205","8809169213424","8809169213340","8809169213365"};//�������ڵ� �迭
		int k20_price[] = {600,500,5000,1500};//�ݾ� �迭
		int k20_num[] = {5,10,4,2};//��ǰ���� �迭
		int k20_totalPrice =0;//�� �ݾ� ����
		String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//�ð� ���� ���� ����
		//ù��° �ð� ��¿� ����
		String k20_date4= k20_dateTime.substring(0,4) + k20_dateTime.substring(4,6) + k20_dateTime.substring(6,8)
        + " " + k20_dateTime.substring(8,10) + k20_dateTime.substring(10, 12) +k20_dateTime.substring(12,14);
		//�ι�° �ð� ��¿� ����
		String k20_date5= k20_dateTime.substring(0,4) +"/"+ k20_dateTime.substring(4,6) +"/"+
							k20_dateTime.substring(6,8) + "-0002-0922";
		//����° �ð� ��¿� ����
		String k20_date6= k20_dateTime.substring(0,4) + k20_dateTime.substring(4,6) + k20_dateTime.substring(6,8)
         + k20_dateTime.substring(8,10) + k20_dateTime.substring(10, 12) +k20_dateTime.substring(12,14)
         + "]";
		//�������
		System.out.printf("\n\n");
		//�ްԼ� ������ ��� ����
		System.out.printf("%1.13s\n","����(����)�ްԼ�");//��ü��
		System.out.printf("%1.20s\n","������ֽð��ݸ������380-4");//�ּ�
		System.out.printf("%1.20s%17.20s\n","�ֺ��� 677-85-00239","TEL:043-857-9229");//��ǥ�� �� ����ó
		System.out.printf("\n");//���� ���
		System.out.printf("\n");//���� ���
		System.out.printf("%1.20s%14.20s%14.20s\n","[������]",k20_date4,"POS��ȣ: 0002");//����ð� �� ������ȣ
		System.out.printf("-----------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.15s%15.10s%3.10s%9.10s\n", "ǰ���ڵ�","�ܰ�","����","�ݾ�");//������ �׸�
		System.out.printf("-----------------------------------------\n");//���м� �ֱ�
		for(int k20_i = 0 ; k20_i < 4; k20_i++){//��ǰ���� �޾ƿ���
			System.out.printf("%1.15s\n",k20_itemname[k20_i]); //��ǰ�� ���
			//������ �ڵ�, �ܰ�, ����, �ݾ� ���
			System.out.printf("%1.15s%11.20s%6.10s%11.10s\n",k20_itemcode[k20_i],k20_df.format(k20_price[k20_i]),
					k20_num[k20_i],k20_df.format(k20_price[k20_i]*k20_num[k20_i]));
			k20_totalPrice +=  (k20_price[k20_i]*k20_num[k20_i]);
		}
		System.out.printf("\n");//�������
		int k20_taxation2 = (int)(k20_totalPrice*0.909)+1;//�ΰ��� ���
		int k20_taxAmount2 = k20_totalPrice-k20_taxation2;//���� ���
		int k20_exceptTax = k20_totalPrice-k20_taxAmount2;//���� ��ǰ �ݾ� ���
		System.out.printf("%1.20s%27.20s\n","���� ��ǰ �հ�",k20_df.format(k20_exceptTax)); //���� �ݾ� ���		
		System.out.printf("%1.20s%27.20s\n","��    ��    ��",k20_df.format(k20_taxAmount2));//�ΰ��� ���
		System.out.printf("%1.20s%27.20s\n","��          ��",k20_df.format(k20_totalPrice));//�հ�ݾ�
		System.out.printf("%1.20s%27.20s\n","026-��ī���","00/00A");//ī��� ����
		System.out.printf("%1.20s%25.20s\n","ī  ��  ��  ȣ :","5522-20**-****-BADD");//ī�� ����
		System.out.printf("%1.20s%25.20s\n","ī  ��  ��  �� :",k20_df.format(k20_totalPrice));//ī�� ������ ���
		System.out.printf("%1.20s%22.5s\n","��  ��  ��  �� :","�Ͻú�");//�Һ�/�Ͻú� ����
		System.out.printf("%1.20s%18.20s\n","��  ��  ��  ȣ :04-KICC","75549250");//���ι�ȣ
		System.out.printf("%1.22s\n","�� �� �� �� ȣ :");//������ ��ȣ
		System.out.printf("%1.20s%25.10s\n","��  ��  ��  �� :",k20_df.format(k20_totalPrice));//�� �ݾ�
		System.out.printf("%1.20s%25.10s\n","��    ��    �� :","0");//���ݽ� �Ž����� ����
		System.out.printf("-----------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.20s%11.10s\n","�ֹ���ȣ:","0920");//�ֹ���ȣ
		System.out.printf("-----------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.20s%13.30s\n","�Ǹſ� :","000002 ������2");//�Ǹſ� ����
		System.out.printf("%1.20s\n",k20_date5);//���� �ð� ���
		System.out.printf("%1.20s%17.30s\n","�������:[00138705",k20_date6);//������� ����
	}

}
