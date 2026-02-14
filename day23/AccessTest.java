package day23;

public class AccessTest {
	
	public int a=25;
	private double b=36.85;
	protected String c="Welcome";
	boolean d=false;
	
	public void getPublic()
	{
		System.out.println("its public method");
	}
	
	protected void getProtected()
	{
		System.out.println("its protected method");
	}
	
	private void getPrivate()
	{
		System.out.println("its private method");
	}
	
	void getDefault()
	{
		System.out.println("its default method");
	}
	
	public static void main(String[] args) {
		
		AccessTest at=new AccessTest();
		at.getDefault();
		at.getPrivate();
		at.getProtected();
		at.getPublic();
		
	}

}
