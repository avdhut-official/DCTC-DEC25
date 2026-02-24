package day27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list=new ArrayList(); 		//creating heterogeneous list
		
		//add object at the end of list
		list.add(21);
		list.add("Java");
		list.add(false);
		list.add('V');
		list.add(15.25);
		System.out.println(list.size());
		
		System.out.println(list);
		
		//add object at specified index in list
		list.add(1,"Welcome");
		System.out.println(list);
		
		//get element from list
		System.out.println(list.get(4));
		
		//replace element at given index
		list.set(0, "Automation");
		System.out.println(list);
		
		//adding duplicates
		list.add("Welcome");
		System.out.println(list);
		
		//remove element / object
		list.remove("Welcome");
		System.out.println(list);
		
		//add null values
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		/*
		//remove all objects
		
		list.clear();
		System.out.println(list);*/
		
		
		//remove particular objects without using remove method
		/*
		ArrayList list_remove=new ArrayList();
		list_remove.add("Automation");
		list_remove.add("Java");
		list_remove.add(false);
		
		
		System.out.println("Before :"+list_remove);
		list.removeAll(list_remove);
		System.out.println(list);
		System.out.println("After :"+list_remove);*/
		
		//iterating arraylist using traditional for loop
		
		/*
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		*/
		
		//iterating arraylist using for each loop
		/*
		for(Object x : list)
		{
			System.out.println(x);
		}*/
		
		//iterating arraylist using Iterator
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
