package day24;

import day23.AccessTest;

public class OtherPackage extends AccessTest{
	
	public static void main(String[] args) {
		
		OtherPackage p=new OtherPackage();		//object of child as its inherited
		p.getProtected();
		p.getPublic();
		
	}

}
