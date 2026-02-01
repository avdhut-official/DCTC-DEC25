package day18.multilevel;

public class LoginTest extends BrowserBase {
	
	void executeTest()
	{
		System.out.println("Login Test Executed");
		System.out.println("Login Test Executed");
	}

	public static void main(String[] args) {
		
		LoginTest t=new LoginTest();
		t.loadConfig();
		t.launchBrowser();
		t.executeTest();
	}
}
