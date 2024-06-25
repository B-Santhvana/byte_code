package patterns;

public class FindMissingElements {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2,3, 5, 6, 8, 9, 10};
	        int start = 1;  // Starting number in the range
	        int end = 10;   // Ending number in the range

	        System.out.println("Missing elements:");
	        for (int num = start; num <= end; num++) {
	            if (!show(arr, num)) {
	            	System.out.println("============");	               
	                
	            }
	        }
	    }

	    // Function to check if a number is present in the array
	    public static boolean show(int[] arr, int num) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == num) {
	            	System.out.println(arr[i]);
	            	System.out.println("....................");
	            	System.out.println(num);
	            	System.out.println("---------");
	                return true;
	            }
	        }
	        return false;
	    }
	}



