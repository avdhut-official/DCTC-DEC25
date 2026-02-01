package day10;

public class SearchingInArray {
	
	
	public static void main(String[] args) {
		
		int x[]={5,10,20,25,15};
		int searchNumber=1;
		boolean found=false;
		
		//using traditional for loop
		for(int i=0;i < x.length; i++)
		{
			if(x[i]==searchNumber)
			{
				found=true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println(searchNumber+" Number is found");
		}
		else
		{
			System.out.println(searchNumber+" Number is not found");
		}
		
		
		
		//using for each loop
		
		int y[]={5,10,20,25,15};
		int search_Number=10;
		boolean number_found=false;
		
		//using for each version of for loop
		for(int num : y)
		{
			if(num == search_Number)
			{
				number_found=true;
				break;
			}
		}
		
		if(number_found)
		{
			System.out.println(search_Number+" Number is found");
		}
		else
		{
			System.out.println(search_Number+" Number is not found");
		}
	}

}
