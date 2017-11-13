
public class searchInfo
{
	int shelfSearch;				//진열대검색
	String discontined;				//단종검색
	int sellingNowSearch;			//판매중검색
	String sellingNow;				//판매중상품명
	String discontinedProduct;		//단종상품명
	
	//----------------------------------------------------------void로 설계 해보기
	void loadSearch()
	{
		System.out.println("진열대검색" + this.shelfSearch);
		System.out.println("단종검색" + this.discontined);
		System.out.println("판매중검색" + this.sellingNowSearch);
		System.out.println("판매중상품명" + this.sellingNow);
		System.out.println("단종상품명" + this.discontinedProduct);
	}
	
	void saveSearch( )
	{
		this.shelfSearch = 23;
		this.discontined = "단종상품A검색";
		this.sellingNowSearch = 443;
		this.sellingNow = "판매중상품B";
		this.discontinedProduct = "단종상품A";
		
	}
	//----------------------------------------------------------반환타입으로 설계 해보기
	
	int search_shelf(int shelfSearch)
	{
		return shelfSearch;
	}
	
	String search_disCon(String discontined)
	{
		return discontined;
	}
	
	int search_nowSearch(int sellingNowSearch)
	{
		return sellingNowSearch;
	}
	
	String search_selling(String sellingNow)
	{
		return sellingNow;
	}
	
	String search_disconProduct(String discontinedProduct)
	{
		return discontinedProduct;
	}
	
	
	
}
