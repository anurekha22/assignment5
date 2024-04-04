package assignment5;

public class SecondLargeNumber {
	public static void main(String[] args) {
		
	
	
	 int temp, size;
     int array[] = {3,2,11,4,6,7};
     size = array.length;

     for(int i = 0; i<size; i++ ){
        for(int j = i+1; j<size; j++){

           if(array[i]>array[j]){
              temp = array[i];
              array[i] = array[j];
              array[j] = temp;
           }
        }
     }
     System.out.println("The second largest number is: "+array[size-2]);

}
}
