package day19.methodoverriding;

public class Admin extends BaseTest {
	
	@Override
	void login()
	{
		System.out.println("login using Admin credentials");
		System.out.println("Login Successful");
	}

	@Override
	void logout()
	{
		System.out.println("Logout from Admin");
	}
	
	void getUserDetails()
	{
		System.out.println("User is Admin");
	}
	
}
