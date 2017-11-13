
public class mainClass 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SClass sc = new SClass();
		sc.doS();
		System.out.println("============");
		AClass ac = new AClass();
		//ac.doA();
		System.out.println("============");
		BClass bc = new BClass();
		//bc.doA();	//child class could use super class
		//bc.doB();
		//ac.doB(); //superClass can't use child class
		//ac.doS();
		//bc.doS();
		bc.doA_1();
		
		
	}

}
