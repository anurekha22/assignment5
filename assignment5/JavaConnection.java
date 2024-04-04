package assignment5;


interface DatabaseConnection {
    void connect();
    void disconnect();
    void executeupdate();
}

 public class JavaConnection implements DatabaseConnection {

	public void connect() {
		
	System.out.println("connect to the database");	
	}

	public void disconnect() {
		
		System.out.println("disconnect from the database");
	}

	public void executeupdate() {
		System.out.println("excute the database");
		
	}
	
	public static void main(String[] args)
	{
		DatabaseConnection db=new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeupdate();
		
		
	}

}
