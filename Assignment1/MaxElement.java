package Assignment1;

public class MaxElement {
	
	    public static void main(String[] args) {
	        int[] array = {1, 5, 3, 9, 2,10,20,100};
	        int max = array[0];
	        
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        
	        System.out.println("Maximum element is: " + max);
	    }
	}


