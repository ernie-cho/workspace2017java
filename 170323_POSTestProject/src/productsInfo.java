
public class productsInfo {

	 
		//--------------------------------------------------- �ÿ��� �ڷ� ������ ����
		String name;	 //��ǰ�̸�
		double price;	 //��ǰ����
		int stock;		 //��ǰ����
		int limit_date;	 //�������
		int barcode;	 //��ǰ�ڵ�
		
		//��ǰ���� �ҷ�����
		void loadProductsInfo()
		{
			System.out.println("��ǰ�̸� : "  + this.name);
			System.out.println("��ǰ���� : "  + this.price);
			System.out.println("��ǰ���� : "  + this.stock);
			System.out.println("������� : "  + this.limit_date);
			System.out.println("��ǰ�ڵ� : "  + this.barcode);
		}
		
		//��ǰ���� �����ϱ�
		void saveProductsInfo()
		{
			this.name = "�ƽ� ��ī��� ���ϵ�"; //this.��°��� ������ (class) ������ ������ �ǹ�
			this.price = 3000;
			this.stock = 100;
			this.limit_date = 365;
			this.barcode = 1001;
		}

		
		
		
		
		
		
		
		
		

}
