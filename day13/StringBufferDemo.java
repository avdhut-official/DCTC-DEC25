package day13;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer();		//no value is present
		System.out.println(s1);
		System.out.println(s1.capacity());
		//s1="Hello";		//we cant write this as by default it considers it as String
		
		//use append method if we have created an empty object 
		s1.append("Hello Java Programming we are into an Automation");
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.capacity());
		
		//approach - 2
		StringBuffer s2=new StringBuffer("Java Program");
		System.out.println(s2);
		System.out.println(s2.capacity());
		
		StringBuffer s3=new StringBuffer();	
		
		System.out.println(Integer.MAX_VALUE);
	}

}
