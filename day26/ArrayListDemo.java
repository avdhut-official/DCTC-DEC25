package day26;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList();
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(25);
		
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add(1, 58);
		System.out.println(list);
		
		for(Integer x : list)
		{
			System.out.println(x);
		}
	}

}
