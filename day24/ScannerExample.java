package day24;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);		//created object of Scanner Class
		
		System.out.println("Enter Your Name : ");
		String fullname=input.nextLine();
		
		System.out.println("Hello "+fullname);
		
		System.out.println("Enter Your Name : ");
		String name=input.next();
		
		System.out.println("Hello "+name);
		
		
		
		
		
		/*
		//taking input as Number
		System.out.println("Enter Number :");
		int num=input.nextInt();
		
		//int square=num * num;
		System.out.println("Square of Number is :"+(num * num));
		
		System.out.println("Enter Number is Double format :");
		double d=input.nextDouble();
		System.out.println("Number is : "+d);*/
	}

}
