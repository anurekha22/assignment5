package assignment4;

public class OddUpperCase {
	
	public static void main(String[] args) {
		
		String w = "changeme";
		String upper="";
		char[] word = w.toCharArray();
		 for (int i = 0; i < w.length(); i++) {
	           
	            char x=word[i];
	            
	            if (i % 2 != 0) {
	               
	            	upper = upper +Character.toUpperCase(x);
	            }
	            else {
	            	
	            	upper = upper+word[i];
	            }
	}
		 
		 System.out.println(upper);

}
}
