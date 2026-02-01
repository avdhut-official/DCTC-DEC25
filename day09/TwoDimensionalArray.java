package day09;

public class TwoDimensionalArray {
	
	
	public static void main(String[] args) {
		
		int a[][];			//declaration of two dimensional array
		a=new int[2][2];	//initializing array
		a[0][0]=25;
		a[0][1]=35;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		
		double b[][]=new double[2][2];
		b[0][0]=25;
		b[0][1]=35;
		System.out.println(b[0][0]);
		System.out.println(b[1][1]);
		
		int z[][]={
				{25,35},
				{45,55},
				{65,75},
				{85,95},
				{105,115}
			  };
		
		System.out.println(z[3][0]);
		
		int m[][]= {
					{25,35,45,55},		//row 0
					{65,75,85,95},		//row 1
					{105,115}			//row 2
					};
		System.out.println(m[1][3]);
		System.out.println(m[2][0]);
		System.out.println(m[2][1]);
	//	System.out.println(m[2][2]);
		
		int n[][]=new int[3][4];
		n[0][0]=25;
		System.out.println(n[2][2]);
		
		
	}

}
