package assignment4;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("username");

	}
	public void enterPassword() {
		System.out.println("password ");

	}
	
	public static void main(String[] args) {
		LoginTestData dt= new LoginTestData();
		dt.enterCredentials();
		dt.enterPassword();
		dt.enterUsername();
		dt.navigateToHomePage();
	}

}
