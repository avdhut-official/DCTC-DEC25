package day08;

public class ArrayInJava03 {
	
	public static void main(String[] args) {
		
		double arr[]=new double[5];				//arr is an array of type double having size 5
		arr[0]=45.56;
		arr[1]=55.75;
		arr[2]=65.85;
		arr[3]=75.95;
		arr[4]=85.05;
		
		System.out.println(arr[0]);
		
		//all values in an array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		double r[]= {78.6987888,58.356,25.45,39.11,70};
		
		System.out.println(r.length);
		System.out.println(r[4]);			//as its of type double automatic conversion will happen from int to double
		
		for(int j=0;j<r.length;j++)
		{
			System.out.println(r[j]);
		}
		
		
		double a[]=new double[5];				//a is an array of type double having size 5
		a[0]=45.56;
		a[1]=55.75;
		a[2]=65.85;
		
		//as we have already specified the memory we cannot reduce or increase when the program is in execution
		System.out.println(a[3]);
		System.out.println(a[4]);
		
	}

}
