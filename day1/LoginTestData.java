package week3.day1;

import java.util.Scanner;

public class LoginTestData extends TestData{

	public void  enterUsername() {
		System.out.println("Enter the usernamme:");
		Scanner TD = new Scanner(System.in);
		String username =TD.next("Dillip");
		
	}
	

	public void  enterPassword() {
		System.out.println("Enter the password:");
		Scanner LTD = new Scanner(System.in);
		String password =LTD.next("123!");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login = new LoginTestData();
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials();
		login.navigateToHomePage();

	}

}