package day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		//HashSet<String> hs=new HashSet();	//only String is allowed
		
		HashSet hs=new HashSet();	//creating heterogeneous set
		hs.add("Java");
		hs.add(100);
		hs.add(87.25);
		hs.add(false);
		hs.add("Java");		//adding duplicate
		hs.add(null);
		hs.add(500);
		
		System.out.println("Initial Set : "+hs);
		
		//converting Set to Arraylist
		ArrayList al=new ArrayList(hs);
		System.out.println("Initial Array List:"+al);
		al.add(1, "Automation");
		System.out.println("Inserting Object Array List:"+al);
		
		al.add("Automation");
		System.out.println("Duplicate Object Array List:"+al);
		
		//converting Arraylist to HashSet
		HashSet hs_unique=new HashSet(al);
		System.out.println("Hash Set :"+hs_unique);
		
	}
}











