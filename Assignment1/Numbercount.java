package Assignment1;
import java.util.Arrays;
public class Numbercount {
	

	
	    public static void main(String[] args) {
	        int[] arr = {4, 2, 7, 4, 9, 4, 2, 5, 4}; // Example array
	        int numberToFind = 4; // Number to find occurrences of
	        
	        // Sort the array
	        Arrays.sort(arr);
	        
	        // Count occurrences of the number
	        int occurrenceCount = countOccurrences(arr, numberToFind);
	        
	        // Display the sorted array and occurrence count
	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	        System.out.println("Occurrences of " + numberToFind + ": " + occurrenceCount);
	    }
	    
	    // Method to count occurrences of a number in a sorted array
	    public static int countOccurrences(int[] arr, int number) {
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == number) {
	                count++;
	            }
	        }
	        return count;
	    }
	}


