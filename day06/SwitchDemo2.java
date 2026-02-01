package day06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String week_name="Monday";		//case sensitive
		
		switch(week_name)
		{
			case "Sunday":
				System.out.println(1);
				break;
			case "Monday":
			case "MONDAY":
			case "monday":
				System.out.println(2);
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}

}
