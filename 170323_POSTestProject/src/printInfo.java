public class printInfo 
{

	String userPrint;				//����� ���� ���
	int countPrint;					//�������
	double dateIncomePrint;			//�Ϻ��������
	double monthIncomePrint;		//�����������
	double yearIncomePrint;			//�����������
	double totalIncomePrint;		//�Ѹ���
	
	//----------------------------------------------------------void�� ���� �غ���
	void loadPrint()
	{
		System.out.println("����� ���� ���" + this.userPrint);
		System.out.println("�������" + this.countPrint);
		System.out.println("�Ϻ��������" + this.dateIncomePrint);
		System.out.println("�����������" + this.monthIncomePrint);
		System.out.println("�����������" + this.yearIncomePrint);
		System.out.println("�Ѹ���" + this.totalIncomePrint);
	}	
	
	void savePrint()
	{
		this.userPrint = "Print Test";
		this.countPrint = 1;
		this.dateIncomePrint = 200;
		this.monthIncomePrint = 6000;
		this.yearIncomePrint = 72000;
		this.totalIncomePrint = 43345300;
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
	String print_user(String userPrint)
	{
		return userPrint;
	}
	
	int print_count(int countPrint)
	{
		return countPrint;
	}
	
	double print_date(double dateIncomePrint)
	{
		return dateIncomePrint;
	}
	
	double print_month(double monthIncomePrint)
	{
		return monthIncomePrint;
	}
	
	
	double print_year(double yearIncomePrint)
	{
		return yearIncomePrint;
	}
	
	double print_total(double totalIncomePrint)
	{
		return totalIncomePrint;
	}
	
	
	
	
}
