package day09;

public class TwoDimensionalArrayLoop {
	
	public static void main(String[] args) {
		
		
		int z[][]={
				{25,35,89},
				{45,55,36},
				{65,75,47},
				{85,95},
				{105,115,39}
			  };
		System.out.println(z.length);
		
		for(int i=0;i<z.length;i++)			//number of Rows //i--> 0 to 4 --> 5 times
		{
			System.out.println("Number of columns :"+z[i].length);		//number of columns
			for(int j=0;j<z[i].length;j++)			//j --> 0 to 1 ---> 2 times
			{
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	}

}
