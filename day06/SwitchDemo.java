package day06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num=1;
		switch(num)
		{
			case 2:
				System.out.println(2);
				break;
			case 1:
				System.out.println("Sunday");
				System.out.println("Other Sunday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Saturday");
				break;
			
		}
		
	}

}
