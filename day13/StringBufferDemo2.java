package day13;

public class StringBufferDemo2 {
	
	public static void main(String[] args) {
		
		StringBuffer s2=new StringBuffer("Hello");
		System.out.println(s2.capacity());
		s2.append(" java");
		s2.append(" programming automation");
	
		System.out.println(s2);
		System.out.println(s2.capacity());		//how much it can accomodate
		System.out.println(s2.length());		//number of characters in string, string buffer
		
		//insertion of String
		s2.insert(10, "selenium ");
		System.out.println(s2);
		
		//deletion of characters
		s2.delete(0, 5);			//start index, end index -- end index-1
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		
		//reverse of String
		System.out.println(s2.reverse());
		System.out.println(s2);
		
		s2.replace(0, 4, "java welcome");
		System.out.println(s2);
		
	}

}
