
public class dataInfo
{
	double existIncome; 			//���������б�
	int newIncome;					//�űԸ����߰�
	int productsPrice;				//��ǰ����
	int productsStock;				//�����
	String productsName;			//��ǰ��
	
//----------------------------------------------------------void�� ���� �غ���	
	void loadData() //������ �ҷ�����
	{
		System.out.println("���������б�" + this.existIncome);
		System.out.println("�űԸ����߰�" + this.newIncome);
		System.out.println("��ǰ����" + this.productsPrice);
		System.out.println("�����" + this.productsStock);
		System.out.println("��ǰ��" + this.productsName);
	}
	
	void saveData() //������ �����ϱ�
	{
		this.existIncome = 23244230;
		this.newIncome = 44230;
		this.productsPrice = 2300;
		this.productsStock = 234;
		this.productsName = "��ī�ݶ� 1.5L";
	}
//----------------------------------------------------------��ȯŸ������ ���� �غ���		
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
