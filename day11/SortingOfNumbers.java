package day11;

import java.util.Arrays;

public class SortingOfNumbers {
	
	public static void main(String[] args) {
		
		//Arrays class for sorting numbers
		
		int numbers[]= {40,10,30,20};
		int x[]= {40,10,30,20};
		int y[]= {50,10,30,20};
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);		//in ascending order
		
		System.out.println(Arrays.toString(numbers));
		
		
		
		//sorting on string
		String browsers[]={"Chrome","Firefox","Edge","Safari"};
		System.out.println(Arrays.toString(browsers));
		Arrays.sort(browsers);
		System.out.println(Arrays.toString(browsers));
		
		//comparing arrays
		boolean result= Arrays.equals(x, y);
		System.out.println("Arrays are equal ? "+result);
	}

}
