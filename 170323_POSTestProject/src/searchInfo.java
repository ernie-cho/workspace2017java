
public class searchInfo
{
	int shelfSearch;				//������˻�
	String discontined;				//�����˻�
	int sellingNowSearch;			//�Ǹ��߰˻�
	String sellingNow;				//�Ǹ��߻�ǰ��
	String discontinedProduct;		//������ǰ��
	
	//----------------------------------------------------------void�� ���� �غ���
	void loadSearch()
	{
		System.out.println("������˻�" + this.shelfSearch);
		System.out.println("�����˻�" + this.discontined);
		System.out.println("�Ǹ��߰˻�" + this.sellingNowSearch);
		System.out.println("�Ǹ��߻�ǰ��" + this.sellingNow);
		System.out.println("������ǰ��" + this.discontinedProduct);
	}
	
	void saveSearch( )
	{
		this.shelfSearch = 23;
		this.discontined = "������ǰA�˻�";
		this.sellingNowSearch = 443;
		this.sellingNow = "�Ǹ��߻�ǰB";
		this.discontinedProduct = "������ǰA";
		
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
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
