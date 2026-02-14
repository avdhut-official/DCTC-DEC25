package day23;

public class WrapperTest {
	
	public static void main(String[] args) {
		
		String num1="100";
		String num2="200";
		
		int a=Integer.parseInt(num1); 		//converting string to int
		int b=Integer.parseInt(num2);		//converting string to int
		
		System.out.println(a+b);
		
		
		String price ="99.50";
		double d=Double.parseDouble(price);	//converting string to double
		
		System.out.println(d+0.5);
		
		String big="987654321";				//converting string to long
		long l=Long.parseLong(big);
		
		System.out.println(l);
		
		
		//Convert Number to String
		int num=500;
		double p=45.75;
		
		String s1=String.valueOf(num);		//convert number to String
				
		System.out.println("String from int :  "+s1);
		
		System.out.println(s1 + 100);
		System.out.println(num + 100);
		
		String s2=String.valueOf(p);		//convert double to string
		System.out.println(s2);
		
		
	}
	

}
