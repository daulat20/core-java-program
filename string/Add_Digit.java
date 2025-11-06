package string;

import java.util.Scanner;
//. WAP to accept string from the user and add all the digits in it.
//For example: input: test@123 output: 6

public class Add_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string.");
		String str = sc.next();
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			// System.out.println(str.charAt(i));
			if (str.charAt(i) >='0' && str.charAt(i) <= '9')
				sum = sum + str.charAt(i)-'0';

		}
		
		System.out.println(sum);
	}

}
