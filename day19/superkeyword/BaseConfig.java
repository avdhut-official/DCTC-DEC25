package day19.superkeyword;

public class BaseConfig {
	
	
	//Default Constructor
	BaseConfig()
	{
		 System.out.println("loading confiuration");
	}

	//Parameterised Constructor
	BaseConfig(String config)
	{
		System.out.println("Given Configuration Loaded");
	}
	
	void showData()
	{
		System.out.println("Inside the parent class");
	}
	
	void login()
	{
		System.out.println("Inside the parent class - login");
	}
}