package week3.day1;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("Incognito tab is Opened");
	}
	public void clearCache() {
		System.out.println("Cache is Cleared");
	}
	public static void main(String[] args) {
		Chrome C = new Chrome();
		C.openURL();
		C.navigateBack();
	}
}
