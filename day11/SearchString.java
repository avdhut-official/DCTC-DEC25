package day11;

public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparing String
		String browsers[]={"Chrome","Firefox","Edge","Safari"};
		String searchBrowser="firefox";
		boolean found=false;
		
		for(int i=0;i<browsers.length;i++)
		{
			if(browsers[i]==searchBrowser)
			{
				System.out.println(searchBrowser+" is found in an array at location "+i);
				found=true;
				break;
			}
		}
		if(found==false)
		{
			System.out.println(searchBrowser+" is not found in an array");
		}
	}

}
