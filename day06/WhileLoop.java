package day06;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print values from 1 to 10 ----> 1,2,3,4...10
		
		int i=1;		//initilization
		while(i<=10)		//i = 10 ---> false
		{
			System.out.println(i);
			i++;			//increment by 1
		}
		
		//print message as Hi for 5 times
		
		int j=0;
		while(j<5)
		{
			System.out.println("Hi");
			j++;
		}
		
		//print the odd numbers
		int k=1;
		while(k<=20)
		{
			System.out.println(k);
			k+=2;					//k=k+2
		}
		
		
		//print the even number
		
		int m=21;
		while(m<=20)			//entry loop 
		{
			if(m%2==0)
				System.out.println(m);
			m++;						//m=m+1
		}
	
		//printing of even and odd number from 1 to 20
		int h=1;
		while(h<=20)
		{
			if(h%2==0)
				System.out.println(h + " is Even");
			else
				System.out.println(h + " is Odd");
			h++;
		}
		
		//printing in reverse 10 to 1
		
		int s=10;
		while(s>=0)
		{
			System.out.println(s);
			s--;				//value will decremented by 1
		}
	
	}

}
