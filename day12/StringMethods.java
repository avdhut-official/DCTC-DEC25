package day12;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to java selenium";
		int length=str.length();			//it calculates length of String
		System.out.println(length);
		
		//Concatenation of Strings
		
		String s="Java ";
	//	String concat=s.concat(str);
	//	System.out.println(concat);
		
		System.out.println(s.concat(str));
		
		System.out.println("Hello "+s+str);
		
		//equals and equalsIgnoreCase
		String s3="java ";
		String s4="Java";
		
		System.out.println("Equality of String : "+s3.equals(s4));
		System.out.println("Equality of String Ignore Case: "+s3.equalsIgnoreCase(s4));
		
		//trim, toUpperCase, toLowerCase, contains
		String name=" Java Selenium ";
		System.out.println(name);
		System.out.println(name.trim());		//this will remove leading and trailing spaces
		System.out.println(name.toUpperCase());  //convert into all caps
		System.out.println(name.toLowerCase());  //convert into lower cases
		System.out.println(name.contains(s4));	//checks whether the string is having the given part of string 
		System.out.println(name.contains("Java"));
		
		//charAt
		System.out.println("char at loc : "+s3.charAt(0));
		System.out.println("char at loc : "+s3.charAt(4));
		
		//split
		String name_1="Java Selenium Automation";
		String words[]= name_1.split(" ");
		for(String w : words)
		{
			System.out.println(w);
		}
		/*
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}*/
		
		//toCharArray
		char a1[]= name_1.toCharArray();
		for(char w : a1)
		{
			System.out.println(w);
		}
	}

}
