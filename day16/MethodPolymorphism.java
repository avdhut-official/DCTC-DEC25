package day16;

public class MethodPolymorphism {
	
	
	//method overloading
	void add()
	{
		
		System.out.println("hello");
	}

	void add(int a)
	{
		System.out.println("Hi "+a);
	}
	
	void add(int a, int b)
	{
		System.out.println("Hi "+(a+b));
	}
	
	void add(double b, int a)
	{
		
		System.out.println(a+b);
	}
	
	void add(double b, double a)
	{
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodPolymorphism m1=new MethodPolymorphism();
		//m1.add();
		//m1.add(15);
		m1.add(15, 25);
		m1.add(25.35,69);
		m1.add(38.25,69.64);
	}
}
