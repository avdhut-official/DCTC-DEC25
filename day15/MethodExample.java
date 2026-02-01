package day15;

public class MethodExample {
	
	
	//--Method Without Parameters and Without Return Type--
	public void showMessage()
	{
		System.out.println("Welcome to Java Programming");
	}
	
	//--Method With Parameter and Without Return Type
	
	void add(int a, int b)
	{
		/*int sum=a+b;
		System.out.println(sum);
		int x=sum*12;*/
		System.out.println(a+b);	
	}
	
	void multiply(int x, double m)
	{
		System.out.println(x * m);
	}
	
	//--Method Without Parameter and With Return Type
	
	int getNumber()
	{
		int a=15, b=85;
		return a+b;
	}
	
	String sayHello()
	{
		return "Hello from Say Hello Method";
	}

	//--Method With Parameter and With Return Type
	int substraction(int a, int b)
	{
		return a-b;
	}
	
	void multiplicationTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}






