package day27;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

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
		
		//size
		System.out.println(hs.size());
		
		//removing objects
		hs.remove(87.25);
		hs.remove(500);
		
		System.out.println("After Removing 2 Objects :"+hs);
		
		
		System.out.println("Contains or Not :"+ hs.contains("Java"));
		
		//for each loop
		System.out.println("For Each Output");
		for(Object x : hs)
		{
			System.out.println(x);
		}
		
		//iterating using Iterator
		System.out.println("Iterator Output");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		hs.clear(); 		//remove all objects at once
		System.out.println("After Removing all Objects :"+hs);
		
	}
}











