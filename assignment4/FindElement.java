package assignment4;

public class FindElement {
	public static void main(String[] args) {
		  int[] array = {1, 4, 3, 2, 8, 6, 7};
	        int n = array.length + 1;
	        int totalSum = n * (n + 1) / 2;
	        int arraySum = 0;
	        
	        
	        for (int num : array) {
	            arraySum += num;
	        }
	        
	       
	        int missingElement = totalSum - arraySum;
	        
	        System.out.println("The missing element is: " + missingElement);
	    }
	
	}


