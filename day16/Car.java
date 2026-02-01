package day16;

public class Car {
	
	//class variables
	String color;
	int price;
	double rating;
	boolean isExpensive;
	
	//default constructor
	Car()
	{
		System.out.println("in default constructor");
		color="Red";
		price=350000;
	}
	
	//parameterised constructor
	Car(String c,int p, double r, boolean i)
	{
		System.out.println("In parameterised constructor V1");
		color=c;
		price=p;
		rating=r;
		isExpensive=i;
	}
	
	Car(String c)
	{
		color=c;
	}

	Car(int p)
	{
		color="Orange";
		price=p;
	}
	
	Car(int p, double r, boolean i,String c)
	{
		System.out.println("In parameterised constructor V2");
		color=c;
		price=p;
		rating=r;
		isExpensive=i;
	}
	
	//no return type and no parameters
	void drive()
	{
		System.out.println(color);
		System.out.println(price);
		System.out.println(rating);
		System.out.println(isExpensive);
	}

}
