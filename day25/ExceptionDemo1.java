package day25;

import java.util.Scanner;

public class ExceptionDemo1 {
	
	public void show()
	{
		try {
			Scanner input = new Scanner(System.in);
			int num = 25;

			System.out.println("Enter Number : ");
			int a = input.nextInt();

			int z = num / a;

			System.out.println("Division :" + z);
		}
		
		catch(Exception e)
		{
			System.out.println("Testing");
		}
	}
	
	public static void main(String[] args) {
		
		try
		{
			Scanner input = new Scanner(System.in);
			int num = 25;

			System.out.println("Enter Number : ");
			int a = input.nextInt();

			int z = num / a;

			System.out.println("Division :" + z);
		}
		catch(Exception e)
		{
			System.out.println("Can not divide by zero");
		}
		System.out.println("Program Continues");
		System.out.println("Hello Lets Do Sum");
		
	}

}
