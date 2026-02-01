package day12;

import java.util.Arrays;

public class StringInterview {
	
	public static void main(String[] args) {
		
		//Reverse of String
		String s="Java Selenium";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		//palindrome of String
		String str="java";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
		//count number of vowels
		String str3="Automation";
		int count=0;
		str3=str3.toLowerCase();
		
		for(int i=0;i<str3.length();i++)
		{
			char ch=str3.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		
		System.out.println("Count of Vowels : "+count);
		
		//count of words
		String name_1="Java Selenium Automation";
		String words[]= name_1.split(" ");
		System.out.println(words.length);
		
		//sorting of char array
		String name_2="java";
		char a1[]= name_2.toCharArray();
		Arrays.sort(a1);
		for(char a2: a1)
		{
			System.out.print(a2);
		}
	}

}
