package day08;

public class ArrayInJava {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];			// creating a memory to store 5 values --> index begins from a[0],a[1],2,3,4
		a[0]=15; 					// will store 15 value at 0th location 
		a[1]=20;
		a[2]=25;
		a[3]=30;
		a[4]=35;
		
		System.out.println(a[0]);
		
		a[0]=40; 					//updating the index
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	
		
	}

}
