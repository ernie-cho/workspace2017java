import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Main01 {
	static ArrayList<k20_OneRec> k20_ArrayOneRec = new ArrayList <k20_OneRec>();
	static int count_person = 0;//���� ������ ��� �� ����
	static int count_person2 = 0;//���� ������ ��� �� ����
	static int k20_sum_student_id =0;//�л� ID
	static int k20_sumkor, k20_sumkor2 = 0;//����,���� ���
	static int k20_sumeng, k20_sumeng2 = 0;//����,���� ����
	static int k20_summat, k20_summat2 = 0;//����,���� ����
	static int k20_sumsum, k20_sumsum2 = 0;//����,���� �հ�
	static int k20_sumave, k20_sumave2 = 0;//����,���� ���
	/*��� �ο��� ����*/
	static final int k20_iPerson = 100;
	
	DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//�ݾ� ���� ���� ����
	static GregorianCalendar k20_calender = new GregorianCalendar();//��¥ ���ϱ� �Լ�
	static SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss"); // ����Ͻú� ����
	static String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//�ð� ���� ���� ����
	 //ù��° �ð� ��¿� ����
	static String k20_date= k20_dateTime.substring(0,4) +"."+ k20_dateTime.substring(4,6) +"."+ k20_dateTime.substring(6,8)
    + " " + k20_dateTime.substring(8,10) +":" + k20_dateTime.substring(10, 12) +":"+k20_dateTime.substring(12,14);
	
	
	//������ ����
	public static void dataSet(){
		for(int k20_i = 0 ; k20_i < k20_iPerson ; k20_i++){
			String k20_name = String.format("ȫ��%05d", k20_i+1); //�̸� �����
			int k20_kor =  (int)(Math.random()*100);			 //��� ���� �����
			int k20_eng =  (int)(Math.random()*100);			 //���� ���� �����
			int k20_mat =  (int)(Math.random()*100);			 //���� ���� �����
			// �ϳ��� OneRecŬ���� ���� ��, ArrayList�� insert
			k20_ArrayOneRec.add(new k20_OneRec(k20_i+1,k20_name,k20_kor,k20_eng,k20_mat));
			
		}
	}
	 //�ݺ� ����� ���� ���� ����
	static int k20_count = 0; //�л� ID��ȣ�� ������ ����
	static int k20_pageCount = 0; //������ ��ȣ�� ������ ����
	//����μ�
	public static void HeaderPrint() {
		
			System.out.printf("%29s\n", "��������ǥ");/*���� ���*/
			/*������ ī��Ʈ + ����Ͻ� ���*/
			System.out.printf("%5s %1d %24s %8.20s \n","PAGE : ",k20_pageCount+1, "������� :",k20_date);
			System.out.printf("============================================================\n");/*������ �ֱ�*/
			System.out.printf("%2s %4s %11s %5s %5s %7s   %4s\n","��ȣ","�̸�","����","����","����","�հ�","���");
			System.out.printf("============================================================\n");/*������ �ֱ�*/
			k20_pageCount ++;
		
	}
	//�����μ�
	public static void ItemPrint(int k20_i){
		k20_OneRec k20_rec;
		/*�迭�� ����� ���� ȣ��*/
		k20_rec = k20_ArrayOneRec.get(k20_i);
		/*�������� ������ ����data ���� ���*/
		System.out.printf("%05d %8s %7d %7d %8d %8d %9d\n",
				k20_rec.k20_student_id(), k20_rec.k20_name(), k20_rec.k20_kor(), k20_rec.k20_eng(),
				k20_rec.k20_mat(),k20_rec.k20_sum(),k20_rec.k20_ave());
		/* ���� ������ */
		k20_sumkor += k20_rec.k20_kor();/*���� ��� �հ�*/
		k20_sumeng += k20_rec.k20_eng();/*���� ���� �հ�*/
		k20_summat += k20_rec.k20_mat();/*���� ���� �հ�*/
		k20_sumsum += k20_rec.k20_sum();/*���� �հ� �հ�*/
		k20_sumave += k20_rec.k20_ave();/*���� ��� �հ�*/
		/* ���� ������ */
		k20_sumkor2 += k20_rec.k20_kor();/*���� ��� �հ�*/
		k20_sumeng2 += k20_rec.k20_eng();/*���� ���� �հ�*/
		k20_summat2 += k20_rec.k20_mat();/*���� ���� �հ�*/
		k20_sumsum2 += k20_rec.k20_sum();/*���� �հ� �հ�*/
		k20_sumave2 += k20_rec.k20_ave();/*���� ��� �հ�*/
		count_person++; //���� �������� ��� �� ����
		count_person2++;//���� �������� ��� �� ����
		
	}
	//���� �μ�
	static int k20_page_person = 30; //�� �������� �ο�������
	
	public static void TailPrint(){
		System.out.printf("============================================================\n");/*������ �ֱ�*/
		System.out.printf("����������\n"); /*���� ������*/
		/*���� data ���*/
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","�հ�",k20_sumkor,k20_sumeng,k20_summat,k20_sumsum,k20_sumave);
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","���",k20_sumkor/count_person,
				k20_sumeng/count_person,k20_summat/count_person,
				k20_sumsum/count_person,k20_sumave/count_person);
		System.out.printf("============================================================\n");/*������ �ֱ�*/
		System.out.printf("����������\n"); /*���� ������*/
		/*���� data ���*/
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","�հ�",k20_sumkor2,k20_sumeng2,k20_summat2,k20_sumsum2,k20_sumave2);
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","���",k20_sumkor2/count_person2,
				k20_sumeng2/count_person2,k20_summat2/count_person2,
				k20_sumsum2/count_person2,k20_sumave2/count_person2);
		System.out.printf("============================================================\n");/*������ �ֱ�*/
		//���ο� ������ ������ ���� �ʱ�ȭ ������
		k20_sumkor = 0;/*���� �ʱ�ȭ*/
		k20_sumeng = 0;/*���� �ʱ�ȭ*/
		k20_summat = 0;/*���� �ʱ�ȭ*/
		k20_sumsum = 0;/*�հ� �ʱ�ȭ*/
		k20_sumave = 0;/*��� �ʱ�ȭ*/		
	}
	//������ sort
	public static void dataSort(){
		Comparator<k20_OneRec> k20_compare = new Comparator<k20_OneRec>(){
			public int compare(k20_OneRec a1, k20_OneRec a2){ 
				return(a2.k20_sum()-a1.k20_sum());  //���� ������ �հ�� ��
			}
		};
		Collections.sort(k20_ArrayOneRec, k20_compare); //�հ�� ����
		//Collections.reverse(k20_ArrayOneRec, k20_compare); //�հ�ݴ�� ����
	}
	
	
	
	
	
	
	
	
	
}
