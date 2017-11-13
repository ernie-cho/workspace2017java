//������ ���  Lec05_01, ������
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class K20_170524 {

	public static void main(String[] args) {		
		// Lecture5 page7 -----------------------important
		// ������ ������ ���
		int k20_iPrice = 210000000; // ���ݼ���
		int k20_taxation = (int)(k20_iPrice*0.909)+1; //�ΰ��� ���
		int k20_taxAmount = k20_iPrice-k20_taxation;  //���� ���
		int k20_default = 0; //�������� 0������ ����ó��
		
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); //�ݾ� ���� ���� ����
		GregorianCalendar k20_calender = new GregorianCalendar();		  //��¥ ���ϱ� �Լ�
		SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss"); // ����Ͻú� ����
		String k20_dateTime = k20_dateFormat.format(k20_calender.getTime()); //�ð� ���� ���� ����
		//ù��° �ð� ��¿� ����
		String k20_date1= k20_dateTime.substring(0,4) + k20_dateTime.substring(4,6) + k20_dateTime.substring(6,8) ;
		//�ι�° �ð� ��¿� ����
		String k20_date2= k20_dateTime.substring(0,4) + "-" + k20_dateTime.substring(4,6)+"-" + k20_dateTime.substring(6,8)
        + " " + k20_dateTime.substring(8,10) + ":" + k20_dateTime.substring(10, 12) + ":" +k20_dateTime.substring(12,14);
		//����° �ð� ��¿� ����
		String k20_date3= k20_dateTime.substring(0,4) + "-" + k20_dateTime.substring(4,6)+"-" + k20_dateTime.substring(6,8)
        + " " + k20_dateTime.substring(8,10) + ":" + k20_dateTime.substring(10, 12) ;
		//���� ���		
		System.out.printf("\n\n");
		//������ ��� ����
		System.out.printf("%13.3s%5.5s%5.5s\n","��","��","��"); //������ ù�� ���
		System.out.printf("--------------------------------------\n"); //���м� �ֱ�
		System.out.printf("%1.20s%14.20s\n", "���λ�ȸ(�д缭����)","129-17-77924");//��ü �� ����ڹ�ȣ
		System.out.printf("%1.8s%5.5s%4.5s%5.5s\n", "�̻�ö","031", "781", "1596"); //��ǥ�� �� ����ó
		System.out.printf("%1.8s%5.5s%5.5s%6.5s\n", "������","�д籸", "������", "269-3");//�ּ�
		System.out.printf("%1.8s%3.5s\n", "���̺��  :","12"); //���̺��
		System.out.printf("%1.8s%9.30s%5.30s\n", "�ֹ���ȣ  :",k20_date1," 01 00041");//�ֹ���ȣ
		System.out.printf("--------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.8s%30.12s\n", "�ֹ��հ�",k20_df.format(k20_iPrice));//�ֹ� �ݾ�
		System.out.printf("%1.8s%30.12s\n", "���αݾ�","0"); //��������� �ݾ�
		System.out.printf("%1.8s%30.12s\n", "�ֹ��հ�",k20_df.format(k20_iPrice));//�ֹ� �հ�
		System.out.printf("--------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.8s%11.10s%6.8s%13.11s\n", "��  ��",k20_default,"��  ��",k20_df.format(k20_taxation));//����&����
		//ī�� ���� ���� ���� �ѱݾ��� ��10%
		System.out.printf("%1.8s%11.12s%6.8s%13.11s\n", "ī  ��",k20_df.format(k20_iPrice),"��  ��",k20_df.format(k20_taxAmount));
		//����Ʈ �� �鼼
		System.out.printf("%1.8s%11.10s%6.8s%13.11s\n", "����Ʈ",k20_default,"��  ��",k20_default);
		System.out.printf("%23.8s%11.12s\n", "�����ݾ�",k20_df.format(k20_iPrice));//�� �ݾ�
		System.out.printf("--------------------------------------\n");//���м� �ֱ�
		System.out.printf("%20.50s\n","[�츮ī�� �ſ� ����]");//���� ����
		System.out.printf("%1.15s%20.50s\n", "�� �� �� �� :",k20_date2);//���� �ð�
		System.out.printf("%1.15s%16.50s\n", "ī �� �� ȣ :","5522059****2021");//ī�� ����
		System.out.printf("%1.15s%9.50s%7.10s%3.5s\n", "�� �� �� ȣ :","79753574","�Һΰ��� :","00");//�Ͻú�, �Һ� ����
		System.out.printf("%1.15s%7.50s\n", "�� �� �� �� :",k20_df.format(k20_iPrice));//���͹�ȣ
		System.out.printf("%1.15s%10.50s%2.50s%6.50s\n", "�� �� �� ȣ :","730461774","/","��ī���");//���͹�ȣ
		System.out.printf("%1.15s%13.20s\n", "����� ��ȣ :","129-17-77924");//����ڹ�ȣ
		System.out.printf("--------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.30s%12.50s%8.10s\n", k20_date3, "CASHIER  :","����");//�ð� �� ��� ����
		System.out.printf("--------------------------------------\n");//���м� �ֱ�
		System.out.printf("%1.8s%5.10s\n", "����","�մϴ�.");//�����մϴ�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
