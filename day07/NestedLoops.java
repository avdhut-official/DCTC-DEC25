package day07;

public class NestedLoops {
	
	public static void main(String[] args) {
		
		
		//nested for loop
		for(int i=1;i<=5;i++)			//outer loop
		{
			for(int j=1;j<=5;j++)		//inner loop
			{
				System.out.println("i="+i+" j="+j);
				if(i==j)
				{
					break;			//break from nearest loop
				}
				
			}	
		}
		
		System.out.println("Outer Loop Execution Entry");
		// nested for loop
abc:  for (int i = 1; i <= 5; i++) 		// outer loop
		{
			for (int j = 1; j <= 5; j++) // inner loop
			{
				System.out.println("i=" + i + " j=" + j);
				if (i == j) 
				{
					break abc; // break from abc loop --> OUTER
				}

			}
		}

	System.out.println("Outer Loop Execution Exit");
		
	}

}
