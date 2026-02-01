package day03;

public class IncrementNDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//increment operator  -- increase value by 1
		int x=15;
		x++;					// x = x+1 -- x=16
		System.out.println(x);
		
				
		int r=x++;			//r=x x=x+1		x=16 ---> 17		//post increment
		System.out.println(r);
		System.out.println(x);
		
		int z=++x;			//x=x+1 z=x ---> 		pre increment
		System.out.println(z);
		System.out.println(x);
		
		//decrement operator -- decrease value by 1
		int y=25;
		y--;			//y=y-1
		System.out.println(y);
		
		int b=y--;			//post decrement
		System.out.println(b);
		System.out.println(y);
		
		int a=--y;			//pre decrement
		System.out.println(a);
		System.out.println(y);
	}

}
