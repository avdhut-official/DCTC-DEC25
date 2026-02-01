package day18.single;

public class TestRunner {
	
	public static void main(String[] args) {
		
		LoginTest test=new LoginTest();
		test.launchBrowser();
		test.loginTest();
		test.closeBrowser();
	}

}
