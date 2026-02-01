package day19.superkeyword;

public class Runner {
	
	public static void main(String[] args) {
		
		TestConfig t1=new TestConfig();		//calls the default constructor
		t1.showData();
		t1.login();
		
		TestConfig t2=new TestConfig("config"); //calls the parametrised constructor of Test Config
	}

}
