
public class PerfectNumber {
	public static void main(String[] args) {
		
	
		int num = 6;
	    int sum = 0;
	
	    // Loop from 1 to num/2 to find proper divisors
	    for (int i = 1; i <= num / 2; i++) {
	        if (num % i == 0) {
	            sum += i;
	            
	        }
	    }
	
	    // Check if the number is perfect
	    if (sum == num) {
	        System.out.println(num + " is a Perfect Number.");
	    } else {
	        System.out.println(num + " is not a Perfect Number.");
	    }
	}

}
