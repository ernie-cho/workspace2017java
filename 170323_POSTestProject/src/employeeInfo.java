
public class employeeInfo 
{
	String empPOSsetting;	//����POS����
	double empEachIncome;	//�������Ǹű���ȸ
	int areaPOS;			//������POS
	int empEachPOS;			//�������POS

//----------------------------------------------------------void�� ���� �غ���	
	void loadEmployeeInfo()
	{
		System.out.println("����POS����" + this.empPOSsetting);
		System.out.println("�������Ǹű���ȸ" + this.empEachIncome);
		System.out.println("������POS" + this.areaPOS);
		System.out.println("�������POS" + this.empEachPOS);
	}
	
	void saveEmployeeInfo()
	{
		this.empPOSsetting = "A";
		this.empEachIncome = 434030;
		this.areaPOS = 8;
		this.empEachPOS = 8;		
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	String employee(String empPOSsetting)
	{
		return empPOSsetting;
	}
	
	double employee_each(double empEachIncome)
	{
		return empEachIncome;
	}
	
	int employee_area(int areaPOS)
	{
		return areaPOS;
	}
	
	int employee_POS(int empEachPOS)
	{
		return empEachPOS;
	}
	
	
	
	
	
	
}
