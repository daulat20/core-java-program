package string;
import java.util.Scanner;

public class CheckDelimiter {

	    public static void checkDelimiter(String str, String delimiter) {
	        if (str.contains(delimiter)) {
	            System.out.println("✅ The string contains the delimiter '" + delimiter + "'.");
	        } else {
	            System.out.println("❌ The string does not contain the delimiter '" + delimiter + "'.");
	        }
	 
	        System.out.println("\n Splitting the string using delimiter '" + delimiter + "':");
	        String[] parts = str.split(delimiter);
	        for (int i = 0; i < parts.length; i++) {
				System.out.println(parts[i]);
			}
	    }

	    // MAIN method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.println("\n1. Checking for specific delimiter ','");
	        
	        System.out.print("Enter a specific delimiter: ");
	        String delimiter = scanner.nextLine();
	        checkDelimiter(input, delimiter);

	       

	        scanner.close();
	    }
	


}
