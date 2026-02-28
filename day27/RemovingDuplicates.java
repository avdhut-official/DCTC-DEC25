package day27;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicates {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("Automation");
		list.add(21);
		list.add("Java");
		list.add(false);
		list.add('V');
		list.add(15.25);
		list.add("Automation");
		list.add(21);
		list.add("Java");
		
		System.out.println("Initial Arraylist :"+list);
		
		//Scenario 1 -- Convert Arraylist to HashSet
		HashSet set=new HashSet(list);
		System.out.println(set);
		
		//Scenario 2 - Using Contains method
		ArrayList list_unique=new ArrayList();
		System.out.println(list_unique);
		
		
		for(Object x : list)
		{
			if(!list_unique.contains(x))
			{
				list_unique.add(x);
			}
		}
		
		System.out.println(list_unique);
	}

}








