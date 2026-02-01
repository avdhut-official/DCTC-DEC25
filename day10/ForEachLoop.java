package day10;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		//one dimensional array using for each
		int x[]={5,10,15,20,25};
		for(int i : x)
		{
			System.out.println(i);
		}
		
		//one dimensional array using for each - double
		double y[]={5.15,10.25,15.78,20.68,25.69,35.69};
		
		for(double z : y)
		{
			System.out.println(z);
		}
		
		//one dimensional array using for each - String
		String names[]= {"Vinay","Ajay","Vijay"};
		for(String n : names )
		{
			System.out.println(n);
		}
		
		//two dimensional array using for each

		int numbers[][]={
				{25,35,89},
				{45,55,36},
				{65,75,47},
				{85,95},
				{105,115,39}
			  };
			
		for(int row[] : numbers)					// this denotes row
		{
			for(int col : row)			
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
