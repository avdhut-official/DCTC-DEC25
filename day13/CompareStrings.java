package day13;

public class CompareStrings {
	
	public static void main(String[] args) {
		
		String s1="java";			
		String s2=new String("java");
		String s3=new String("java");
		
		System.out.println(s1==s2);			//referring to an object
		System.out.println(s1.equals(s2));	//compare the values
		System.out.println(s2==s3);		
	}

}
