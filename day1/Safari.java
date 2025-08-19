package week3.day1;

public class Safari extends Edge {
	
	public void readerMode() {
		System.out.println("Reader Mode");
	
	}
	
	public void fullScreenMode() {
		System.out.println("FullScreen Mode");
	
	}
	
	public static void main(String[] args) {
		Safari S = new Safari();
		S.takeSnap();
		S.navigateBack();
		S.openIncognito();
	}

}
