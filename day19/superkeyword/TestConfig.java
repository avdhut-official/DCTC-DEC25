package day19.superkeyword;

public class TestConfig extends BaseConfig {
	
	//Default constructor
	TestConfig()
	{
		//super("Config to Parent");
		System.out.println("Test confiuration");
	}
	
	//parameterised constructor
	TestConfig(String c)
	{
		super("Configuration");
		System.out.println("Parameterised Test confiuration Loaded");
	}
	
	@Override
	void showData()
	{
		System.out.println("Inside the Child class");
		super.showData();       //calling the super/parent class method
	}
}
