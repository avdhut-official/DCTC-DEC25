package day03;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//for working logical operator the input must be in boolean (true / false)
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);		//false
		System.out.println(x || y);		//true
		System.out.println(!x);			//false
		System.out.println(!y);			//true
		
		
		System.out.println((89 > 56) && (23 < 12));		//false
		
		int a=89, b=56, p=23, q=12;
		System.out.println((a > b) || (p < q));			//true
	}

}
