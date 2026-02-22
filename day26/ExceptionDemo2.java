package day26;

public class ExceptionDemo2 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Printing Numbers");
		
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);		//causing exception
			} 
			catch (Exception e) {
				
				System.out.println("Slowing down");
			}
			System.out.println(i);
			
			try {
				Thread.sleep(1000);		//causing exception
			} catch (InterruptedException e) {
				
				System.out.println("Slowing down");
			}
		
			System.out.println("Hello");	
			
			try
			{
				Thread.sleep(1000);		//causing exception
			}
			catch(Exception e)
			{
				System.out.println("Slowing down");
			}
			
			System.out.println("Hi");
		}
	}

}
