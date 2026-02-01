package day17;

public class Car extends Vehicle 
{
	
	void drive()
	{
		System.out.println("Car is driving");

	}

	public static void main(String[] args) {
		
		Car c1=new Car();		//object of child class
		c1.start();				//inherited method - parent class method
		c1.drive();				//own method
	
		//only parent methods will be accessed
		Vehicle v1=new Vehicle();
		v1.start();
		
		System.out.println("In Main Method of Car Class");
	}

}
