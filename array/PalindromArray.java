public class PalindromArray {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 1};

	        if (isPalindrome(arr)) {
	            System.out.println("The array is a Palindrome.");
	        } else {
	            System.out.println("The array is NOT a Palindrome.");
	        }
	    }

	    public static boolean isPalindrome(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            if (arr[start] != arr[end]) {
	                return false; // not palindrome
	            }
	            start++;
	            end--;
	        }
	        return true; // palindrome
	    }
	
	
	
	


}
