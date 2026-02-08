package day14;

public class Car {
	
	String color;
	int price;
	double rating;
	boolean isExpensive;

	void drive()
	{
		System.out.println(color);
		System.out.println(price);
		System.out.println(rating);
		System.out.println(isExpensive);
	}

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.color="Blue";
		c1.drive();
		
		Car c2=new Car();
		c2.color="Red";
		c2.drive();
	}
}
