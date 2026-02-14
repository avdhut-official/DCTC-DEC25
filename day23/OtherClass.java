package day23;

public class OtherClass {
	
	public static void main(String[] args) {
		
		AccessTest at=new AccessTest();
		at.getDefault();
		//at.getPrivate();			//cant access as its limite to only same class
		at.getProtected();
		at.getPublic();
	}

}
