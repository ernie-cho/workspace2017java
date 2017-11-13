
public class BClass extends AClass
{
	int money = 100;
	public void doB()
	{
		System.out.println("publicBBBB");
		int myHouse = super.house;
		//super.money -= 100;			//use super class money
		//this.money -= 100;			//use child or itself's class money
		//super.doA();
		//super.doS();
		//super.doA_1();
	}
	
	
}
