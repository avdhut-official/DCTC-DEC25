package day20;

public class Test {
	
	
	public static void main(String[] args) {
		
		/*ChromeBrowser chrome=new ChromeBrowser();
		chrome.launch();
		chrome.getName();
		chrome.getURL();*/
				
		/*EdgeBrowser edge=new EdgeBrowser();
		edge.launch();
		edge.getName();
		edge.getURL();*/
		
		
		Browser driver=new EdgeBrowser();
		driver.launch();
		driver.getName();
		driver.getURL();
		
		
		
	}
	

}
