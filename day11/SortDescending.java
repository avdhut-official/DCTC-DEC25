package day11;

import java.util.Arrays;

public class SortDescending {
	
	public static void main(String[] args) {
		
		//Arrays class for sorting numbers
		
		int numbers[] = { 40, 10, 30, 20 };
		
		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers); // in ascending order
		
		for(int i=numbers.length - 1;i>=0;i--)
		{
			System.out.print(numbers[i]+" ");
		}
	}

}
