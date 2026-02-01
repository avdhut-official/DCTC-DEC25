package day03;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ternary Operator - var=exp ? result 1 : result 2;	
		//if expression is true assign value after ? if false assign value after :
		
		//example 1
		int m=50, n=60;
		
		int z=(m > n) ? m : n;		//m =50 and n=50 --- m >= n --- true
		
		System.out.println(z);
		
		
		//example 2
		//if expression is true assign value after ? if false assign value after :
		int t=(8 == 6) ? 100 : 200;			
		System.out.println(t);
		
		//exmple 3
		
		int age=35;
		String result=(age >= 18) ? "Eligible for Voting" : "Not Eligible";
		System.out.println(result);
		
	}

}
