package day25;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList();		//only int objects can stored
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(25);
		
		System.out.println(list);
		
		list.remove(0);			//this will remove element at 0th location
		System.out.println(list);
		
		list.add(1, 58);		//method overloading - this method will insert object at 1st location 
		System.out.println(list);
		
		
		//used for displaying the array list object using for each 
		for(Integer x : list)
		{
			System.out.println(x);
		}
	}

}
