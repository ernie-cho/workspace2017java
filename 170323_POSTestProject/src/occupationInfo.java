
public class occupationInfo
{
	String occupationSet;		//직군별POS세팅
	String foodSet;				//음식점POS
	String martSet;				//대형마트POS
	String elecSet;				//전자제품POS
	String convinSet;			//편의점POS
	
	//----------------------------------------------------------void로 설계 해보기
	void loadOccupationInfo()
	{
		System.out.println("직군별POS세팅" + this.occupationSet);
		System.out.println("음식점POS" + this.foodSet);
		System.out.println("대형마트POS" + this.martSet);
		System.out.println("전자제품POS" + this.elecSet);
		System.out.println("편의점POS" + this.convinSet);
	}
	
	void saveOccupationInfo()
	{
		this.occupationSet = "어디에 쓰일 POS인가";
		this.foodSet = "FoodCourt";
		this.martSet = "E-mart";
		this.elecSet = "Hi-mart";
		this.convinSet = "7eleven";
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
	
	String occupation_set(String occupationSet)
	{
		return occupationSet;
	}

	String occupation_food(String foodSet)
	{
		return foodSet;
	}

	String occupation_mart(String martSet)
	{
		return martSet;
	}

	String occupation_elec(String elecSet)
	{
		return elecSet;
	}

	String occupation_convin(String convinSet)
	{
		return convinSet;
	}

	
	
}
