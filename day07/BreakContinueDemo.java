package day07;

public class BreakContinueDemo {
	
		public static void main(String[] args) {
			
			
			//break
			System.out.println("Break Demo");
			for (int i = 0; i <= 5; i++) // i=0, 1, 2,3,4,5
			{
				if (i == 2) {
					break;
				}

				System.out.println("Hello : " + i);
			}
			
			
			//continue
			System.out.println("Continue Demo");
			for (int i = 0; i <= 5; i++) // i=0, 1, 2,3,4,5
			{
				if (i == 2) {
					continue;
				}

				System.out.println("Hello : " + i);
			}


		}

}
