package day07;

public class ForDemo {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello : "+i);
		}
		
		
		//print the odd numbers
		
		for (int k = 1;k <= 20;k+=2) 		//k+=2 --> k=k+2
		{
			System.out.println(k);
		}
		
		
		//printing of even and odd number from 1 to 20
		
		for(int h=1;h<=20;h++)
		{
			if(h%2==0)
				System.out.println(h + " is Even");
			else
				System.out.println(h + " is Odd");
		}

	}

}
