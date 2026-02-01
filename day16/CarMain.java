package day16;

public class CarMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the default constructor
		
		Car myCar1=new Car();
		myCar1.drive();
		
		
		Car myCar2=new Car();
		myCar2.color="Gray";		//modifying the default color value
		myCar2.drive();
		
		//calling the parameterised constructor
		
		Car myCar3=new Car("Yellow",450000,4.5,true);
		myCar3.drive();
		
		Car myCar4=new Car("Blue",450000,4.5,true);
		myCar4.drive();

		Car myCar5=new Car(550000,4.8,true,"Violet");
		myCar5.drive();
		
		Car myCar6=new Car("Black");
		myCar6.drive();
		
		Car myCar7=new Car(580000);
		myCar7.drive();
		
		
	}

}
