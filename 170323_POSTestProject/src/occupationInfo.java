
public class occupationInfo
{
	String occupationSet;		//������POS����
	String foodSet;				//������POS
	String martSet;				//������ƮPOS
	String elecSet;				//������ǰPOS
	String convinSet;			//������POS
	
	//----------------------------------------------------------void�� ���� �غ���
	void loadOccupationInfo()
	{
		System.out.println("������POS����" + this.occupationSet);
		System.out.println("������POS" + this.foodSet);
		System.out.println("������ƮPOS" + this.martSet);
		System.out.println("������ǰPOS" + this.elecSet);
		System.out.println("������POS" + this.convinSet);
	}
	
	void saveOccupationInfo()
	{
		this.occupationSet = "��� ���� POS�ΰ�";
		this.foodSet = "FoodCourt";
		this.martSet = "E-mart";
		this.elecSet = "Hi-mart";
		this.convinSet = "7eleven";
	}
	//----------------------------------------------------------��ȯŸ������ ���� �غ���
	
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
