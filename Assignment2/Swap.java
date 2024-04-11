package Assignment2;

public class Swap {
	
	
	    public static void main(String[] args) {
	        int a = 200, b = 300;
	        
	        System.out.println("Before swapping:");
	        System.out.println("a = " + a + ", b = " + b);
	        
	        swapWithoutThirdVariable(a, b);
	        
	       
	    }
	    
	    public static void swapWithoutThirdVariable(int a, int b) {
	        // Swap values without using a third variable and arithmetic operators
	        a = a ^ b;
	        b = a ^ b;
	        a = a ^ b;
	        // Printing swapped values
	        System.out.println("After swapping:");
	        System.out.println("a = " + a + ", b = " + b);
	    }
	}




