package day26;

public class ExceptionDemo3 {
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Printing Numbers");
		
		for(int i=0;i<10;i++)
		{
			
			Thread.sleep(1000);
			System.out.println("Slowing down");

			System.out.println(i);

			Thread.sleep(1000); // causing exception

			System.out.println("Slowing down");

			System.out.println("Hello");

			Thread.sleep(1000); // causing exception

			System.out.println("Slowing down");

			System.out.println("Hi");
		}
	}

}
