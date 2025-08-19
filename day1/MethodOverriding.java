package week3.day1;

public class MethodOverriding extends MethodOverloading{
	
	public void reportStep (String msg, String status)
	{
		System.out.println(msg);
		System.out.println(status);
	}
	public static void main(String[] args) {
		MethodOverriding mor = new MethodOverriding();
		mor.reportStep("How are you", "I am Good");
	}

}
	