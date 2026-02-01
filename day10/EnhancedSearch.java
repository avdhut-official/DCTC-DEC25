package day10;

public class EnhancedSearch {
	
	public static void main(String[] args) {
		int x[]={5,10,20,25,15};
		int searchNumber=1;
		boolean found=false;
		
		//using traditional for loop
		for(int i=0;i < x.length; i++)
		{
			if(x[i]==searchNumber)
			{
				System.out.println(searchNumber+" Number is found");
				found=true;
				break;
			}
		}
		
		if(found==false)
		{
			System.out.println(searchNumber+" Number is not found");
		}
	}

}
