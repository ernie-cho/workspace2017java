
public class dataInfo
{
	double existIncome; 			//기존매출읽기
	int newIncome;					//신규매출추가
	int productsPrice;				//상품가격
	int productsStock;				//재고개수
	String productsName;			//상품명
	
//----------------------------------------------------------void로 설계 해보기	
	void loadData() //데이터 불러오기
	{
		System.out.println("기존매출읽기" + this.existIncome);
		System.out.println("신규매출추가" + this.newIncome);
		System.out.println("상품가격" + this.productsPrice);
		System.out.println("재고개수" + this.productsStock);
		System.out.println("상품명" + this.productsName);
	}
	
	void saveData() //데이터 저장하기
	{
		this.existIncome = 23244230;
		this.newIncome = 44230;
		this.productsPrice = 2300;
		this.productsStock = 234;
		this.productsName = "코카콜라 1.5L";
	}
//----------------------------------------------------------반환타입으로 설계 해보기		
	double income(double existIncome)
	{
		return existIncome;
	}
	
	int incomeAmount(int newIncome)
	{
		return newIncome;
	}
	
	int price(int productsPrice)
	{
		return productsPrice;
	}
	
	int stock(int productsStock)
	{
		return productsStock;
	}
	
	String name(String productsName)
	{
		return productsName;
	}
	
	
}
