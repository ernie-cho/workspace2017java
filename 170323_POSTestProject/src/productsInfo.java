
public class productsInfo {

	 
		//--------------------------------------------------- 택영씨 자료 교수님 설명
		String name;	 //상품이름
		double price;	 //상품가격
		int stock;		 //상품제고
		int limit_date;	 //유통기한
		int barcode;	 //상품코드
		
		//상품정보 불러오기
		void loadProductsInfo()
		{
			System.out.println("상품이름 : "  + this.name);
			System.out.println("상품가격 : "  + this.price);
			System.out.println("상품제고 : "  + this.stock);
			System.out.println("유통기한 : "  + this.limit_date);
			System.out.println("상품코드 : "  + this.barcode);
		}
		
		//상품정보 저장하기
		void saveProductsInfo()
		{
			this.name = "맥심 모카골드 마일드"; //this.라는것은 위에서 (class) 선언한 변수를 의미
			this.price = 3000;
			this.stock = 100;
			this.limit_date = 365;
			this.barcode = 1001;
		}

		
		
		
		
		
		
		
		
		

}
