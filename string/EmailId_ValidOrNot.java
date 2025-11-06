package string;

import java.util.Scanner;

public class EmailId_ValidOrNot {
//WAP to accept email id of the user and check if the email id is valid or not. 
//The valid email id must contain @ symbol and also must have gmail or yahoo in it.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email Id.");
		String Emailid=sc.nextLine();
		
		if(Emailid.contains("@gmail") ||Emailid.contains("@yahoo")) {
			System.out.println("Valid Email Id.");
		}
		else
			System.out.println("Not Valid Email Id");
	}

}
