package day11;

public class SearchStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*char data[]= {'C','h','r','o','m','e'};
		char name[]= {'V','i','n','a','y',' '};*/
		
		//Comparing String -- Case Sensitive
		String browsers[]={"Chrome","Firefox","Edge","Safari"};
		String searchBrowser="Sa";
		boolean found=false;
		
		for(int i=0;i<browsers.length;i++)
		{
			//case sensitive
			/*
			if(browsers[i].equals(searchBrowser))
			{
				System.out.println(searchBrowser+" is found in an array at location "+i);
				found=true;
				break;
			}*/
			
			//case insensitive
			/*if(browsers[i].equalsIgnoreCase(searchBrowser))
			{
				System.out.println(searchBrowser+" is found in an array at location "+i);
				found=true;
				break;
			}*/
			
			//contains -- searching for part of string
			if(browsers[i].contains(searchBrowser))
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
