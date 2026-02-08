package day20;

public abstract class C {
	
	abstract void letsGo();
	abstract void get();
	
	void go()
	{
		System.out.println("Test Abstration");
	}
	
	//its allowed to have constructor of abstract class
	C(int x)
	{
		System.out.println("C Class Constructor :"+x);
	}
}
