package day20;

public class D extends C{
	
	
	D(int a)			// a=15
	{
		super(a);		// call the parameterised constructor of parent
		System.out.println("D Class Constructor :"+a);
	}
	
	@Override
	void letsGo() {
		// TODO Auto-generated method stub
		System.out.println("Lets GO");
	}

	@Override
	void get() {
		// TODO Auto-generated method stub
		System.out.println("Get It");
	}
	
	public static void main(String[] args) {
		
		//C c1=new C();		// we can not create object of abstract class
		D d1=new D(15);		
		d1.go();
		d1.get();
		d1.letsGo();
	}

}







