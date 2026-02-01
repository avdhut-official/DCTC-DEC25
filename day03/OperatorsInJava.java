package day03;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic operator --- + - * / %
		
		int x=50, y=20, r;
		r=x + y;		//sum
		System.out.println("Addition ="+r);
		System.out.println("Addition = "+(x+y));
		System.out.println("Substraction = "+(x-y));
		System.out.println("Multiplication = "+(x*y));
		System.out.println("division = "+(x/y));
		System.out.println("Moulus = "+(x%y));
		
		
		System.out.println(r+y);
		
		
		//Relational Operator / Comparison Operator -- >, <, <=, >=, !=, ==
		
		int m=40, n=50;
		System.out.println(m > n);		//greater than
		System.out.println(m < n);		//less than
		System.out.println(m >= n);		// greater than equal to
		
		
		m=50;
		System.out.println(m >= n);
		System.out.println(m <= n);
		
		double p=56.70, q=36.12;
		System.out.println(p > q);		//greater than
		
		char u='a', z='B';
		System.out.println("comapring char : "+(u > z));		//greater than
		
		//internal calculation from Java to check who is greater or less
		System.out.println("ASCII Code for a:"+(int)u);
		System.out.println("ASCII Code for B:"+(int)z);
		
		u='C';
		System.out.println("ASCII Code for C:"+(int)u);
		System.out.println("comapring char : "+(u < z));		//greater than
		
		
		//check for both values are equal or not -- if same return true otherwise false
		int e=25, f=25;
		System.out.println(e==f);		//true
		f=24;
		System.out.println(e==f);		//false
		
		//check for both values are different or not -- if different return true otherwise false
		System.out.println(e!=f);		//true
	}

}









