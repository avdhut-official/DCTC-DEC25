package day14;

public class CarMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1=new Car();		//object -- myCar1
		myCar1.color="Red";
		myCar1.price= -350000;
		myCar1.rating=5.2;
		myCar1.drive();		
		myCar1.color="Green";
		
		Car myCar2=new Car();		//object -- myCar2
		myCar2.color="Gray";
		myCar2.price=370000;
		myCar2.rating=5.5;
		myCar2.drive();		
		
				
		Car myCar3=new Car(); 		//object -- myCar3
		myCar3.isExpensive=true;
		myCar3.drive();

	}
	
	

}
