package week3.day1;

public class Edge extends Chrome {
	
	public void takeSnap() {
		System.out.println("Snap has been taken");
		}
	public void clearCookies() {
		System.out.println("Cookies has been cleared");
	}
	
	public static void main(String[] args) {
		
		Edge E = new Edge ();
		E.closeBrowser();
		E.clearCache();
		E.clearCookies();
		E.takeSnap();
		E.openIncognito();
	}

}
