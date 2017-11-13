public class store {

	public static void main(String[] args) throws Exception {

		files printList = new files(); 
		printList.loadData();		//file input class from CSV
		
		IOclass inputoutput = new IOclass(); 
		inputoutput.IOtest();		//calculate & file IO class
	}
}
