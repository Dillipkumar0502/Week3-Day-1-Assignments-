package week3.day1;

public class APIClient {
	
		  
		public void sendRequest(String endPoint) {
			System.out.println("The EndPoint is "+endPoint);
		}
		
	   public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
		   System.out.println("The Ouput is "+endPoint+" "+requestBody+" "+requestStatus);
		}
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			APIClient api = new APIClient();
			api.sendRequest("15");
			api.sendRequest("30", "Hello", false);

		}

	}

