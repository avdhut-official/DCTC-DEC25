package day11;

public class SearchIn2D {
	
	public static void main(String[] args) {
		
		int numbers[][]={
				{25,35,89},
				{45,55,36},
				{65,75,47},
				{85,95,55},
				{105,115,39}
			  };
		int searchNumber=55;
		boolean found=false;
		
		for(int row[] : numbers)
		{
			for(int col : row)
			{
				if(col == searchNumber)
				{
					System.out.println(searchNumber+" is found in the 2D array");
					found=true;
					break;
				}
			}
		}
		
		if(found==false)
		{
			System.out.println(searchNumber+" is not found in the 2D array");

		}
		
	}

}
