public class printInfo 
{

	String userPrint;				//사용자 지정 출력
	int countPrint;					//개수출력
	double dateIncomePrint;			//일별매출출력
	double monthIncomePrint;		//월별매출출력
	double yearIncomePrint;			//연간매출출력
	double totalIncomePrint;		//총매출
	
	//----------------------------------------------------------void로 설계 해보기
	void loadPrint()
	{
		System.out.println("사용자 지정 출력" + this.userPrint);
		System.out.println("개수출력" + this.countPrint);
		System.out.println("일별매출출력" + this.dateIncomePrint);
		System.out.println("월별매출출력" + this.monthIncomePrint);
		System.out.println("연간매출출력" + this.yearIncomePrint);
		System.out.println("총매출" + this.totalIncomePrint);
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
	//----------------------------------------------------------반환타입으로 설계 해보기
	
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
