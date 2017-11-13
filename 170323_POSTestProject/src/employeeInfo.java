
public class employeeInfo 
{
	String empPOSsetting;	//직원POS배정
	double empEachIncome;	//직원별판매금조회
	int areaPOS;			//구역별POS
	int empEachPOS;			//직원담당POS

//----------------------------------------------------------void로 설계 해보기	
	void loadEmployeeInfo()
	{
		System.out.println("직원POS배정" + this.empPOSsetting);
		System.out.println("직원별판매금조회" + this.empEachIncome);
		System.out.println("구역별POS" + this.areaPOS);
		System.out.println("직원담당POS" + this.empEachPOS);
	}
	
	void saveEmployeeInfo()
	{
		this.empPOSsetting = "A";
		this.empEachIncome = 434030;
		this.areaPOS = 8;
		this.empEachPOS = 8;		
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
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
