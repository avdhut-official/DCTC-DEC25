package day11;

public class SortingInArray {
	
	public static void main(String[] args) {
		
		int numbers[]= {40,10,30,20};
		int temp;
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if (numbers[i] > numbers[j]) 
				{
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		//printing sorted array
		for(int num : numbers)
			System.out.print(num+" ");

	}

}
