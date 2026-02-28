package day24;

public class Test {
	
	
	public static void main(String[] args) {
		
		//implementation is exposed
		Dog d=new Dog();
		d.sound();	
		
		//implementaion is hidden
		Animal a=new Dog();
		a.sound();
		
		Animal b=new Lion();
		b.sound();
				
	}

}
