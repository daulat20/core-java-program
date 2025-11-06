package string;

import java.util.Scanner;

public class Password_ValidOrNot {
//	 WAP to accept password from the user and check if it valid or not.
//	 The valid password must have 2 digits, 1 special symbol and the length of the password 
//	 must be between 6 to 8.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password.");
		String password = sc.nextLine();
		

		if (password.length() >= 6 && password.length() <= 8) {

			for (int i = 0; i < password.length(); i++) {
				char ch =password.charAt(i);
				System.out.println(ch);
				if(ch >= '1' && ch<='9') {
					
				}

			}
			
		} else {
			System.out.println("Invalid password.");

		}
	}

}
