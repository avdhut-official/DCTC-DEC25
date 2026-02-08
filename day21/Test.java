package day21;

public class Test {
	
	
	//class variables
	
	int empid;		
	String name;
	
	public void getID(int x)
	{
		empid=x;
	}
	
	public void show()
	{
		System.out.println(empid);
	}
	
	public static void main(String[] args) {

		Test t1=new Test();
		t1.empid=45200;
		t1.getID(5000);
		t1.show();
		
		Test t2=new Test();
		t2.getID(15000);
		t2.show();

	}
}
