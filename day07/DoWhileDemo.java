package day07;

public class DoWhileDemo {
	
		public static void main(String[] args) {
			
			int i=12;			//initilization
			
			do
			{
				System.out.println(i);
				i++;			//increment by 1
			}while(i<=10);		//exit loop
			
			//print message as Hi for 5 times
			
			int j=0;
			do
			{
				System.out.println("Hi");
				j++;
			}while(j<5);
		}

}
