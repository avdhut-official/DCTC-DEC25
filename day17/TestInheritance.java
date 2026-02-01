package day17;

import day15.MethodExample;

public class TestInheritance {

	public static void main(String[] args) {

		Car c1 = new Car(); // object of child class
		c1.start(); // inherited method - parent class method
		c1.drive(); // own method
		
		System.out.println("In Main Method of Test Inheritance Class");
		
		
		//we can ignore
		MethodExample m1=new MethodExample();
		m1.showMessage();

	}

}
