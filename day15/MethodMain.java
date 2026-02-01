package day15;

public class MethodMain {
	
	public static void main(String[] args) {

		MethodExample me = new MethodExample();
		me.showMessage();
		me.add(15,25);
		me.add(89, 10);
		me.multiply(25, 12.25);
		
		int x=me.getNumber();
		System.out.println(x);
		
		String str=me.sayHello();
		System.out.println(str);
		
		int y=me.substraction(35, 45);
		System.out.println(y);
		
		me.multiplicationTable(25);
	}

}
