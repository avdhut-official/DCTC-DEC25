package day08;

public class ArrayInJava02 {
	
	public static void main(String[] args) {
		
		
		//here we are directly putting values without specifying the size
		int a[]={15,25,35,40,45,55,65,75,85,95,78,69,96};
		
		System.out.println(a[3]);
		System.out.println(a[5]);
		System.out.println(a[7]);
		//System.out.println(a[11]);				//not allowed
		
		//length is the property of an array
		//it will return the length of array 
		System.out.println("Length of array "+a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);			//its referring to value stored at given location in an array			
		}
		
		//printing index and values in an array
		for(int k=0;k<a.length;k++)
		{
			System.out.println("Element at index "+k+" : "+a[k]);			
		}

	}

}
