package Assignment2;
import java.util.Arrays;
public class Largestelement {
	

	    public static void main(String[] args) {
	        int[] values = {10, 51, 53, 39, 47, 44, 21};
	        
	        int sum = findSumOf2ndAnd3rdLargest(values);
	        
	        System.out.println("Sum of 2nd and 3rd largest numbers: " + sum);
	    }
	    
	    public static int findSumOf2ndAnd3rdLargest(int[] arr) {
	        // Sort the array in descending order
	        Arrays.sort(arr);
	        
	        // Get the length of the array
	        int n = arr.length;
	        
	        // Check if there are at least 3 elements in the array
	        if (n < 3) {
	            System.out.println("Array should have at least 3 elements.");
	            return 0;
	        }
	        
	        // Return the sum of the 2nd and 3rd largest numbers
	        return arr[n-2] + arr[n-3];
	    }
	}


