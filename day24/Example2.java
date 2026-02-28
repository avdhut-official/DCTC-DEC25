package day24;

import java.util.Scanner;

public class Example2 {
	
	final int x=25;
	int y;
	
	void getName(String n)
	{
		
		System.out.println("Name is :"+n);
	}

	void square(int n)
	{
		System.out.println("Square of number is :"+(n*n));
	}
	
	void sum(int a, int b)
	{
		System.out.println("Sum is :"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Example2 e=new Example2();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String str = s.next();
		e.getName(str);
		
		System.out.println("Enter number :");
		int n=s.nextInt();
		e.square(n);
		
		System.out.println("Enter Num 1 :");
		int x=s.nextInt();
		System.out.println("Enter Num 2:");
		int y=s.nextInt();
		
		e.sum(x, y);
	}
}







