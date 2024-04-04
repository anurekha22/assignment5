package assignment4;

public class APIClient {
	
	public void sendrequest(String endpoint) {
		System.out.println(endpoint);
	}

	public void sendrequest(String endpoint,String requestbody,boolean requeststatus) {
		System.out.println(endpoint);
		System.out.println(requestbody);
		System.out.println(true);
	}


	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendrequest("endpoint is passed");
		api.sendrequest("endpoint is passed", "requestbody is passing", true);
	}
	}



