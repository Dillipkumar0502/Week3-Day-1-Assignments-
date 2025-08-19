package week3.day1;

public class Browser {
	
	public void openURL() {
		System.out.println("Open the URL");
	}
	public void closeBrowser() {
		System.out.println("Close the Browser ");
	}
	public void navigateBack() {
		System.out.println("Go Back to the Screen");
	}
	
	public static void main(String[] args) {
		
		String browserName= "Google Chrome";
		String browserVersion= "139.0.7258.67";
		Browser b = new Browser();
		b.openURL();
				
				
				
	}
	}

 	