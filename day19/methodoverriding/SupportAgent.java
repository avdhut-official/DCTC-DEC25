package day19.methodoverriding;

public class SupportAgent extends Admin {
	
	@Override
	void getUserDetails()
	{
		System.out.println("User is SupportAgent");
	}

	void login()
	{
		System.out.println("login using Support Agent credentials");
		
	}
	
}
