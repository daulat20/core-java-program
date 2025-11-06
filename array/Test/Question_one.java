package Test;

import java.util.Scanner;

public class Question_one {
//	WAP to accept user's information and print report of that information.
//	 The report contains: no of words, no of characters, no of consonants,
//	 no of vowels, no of capital letters, no of lower case characters, 
//	 no of symbols and no of digits.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String :- ");
		String str = sc.nextLine();
		int word = 0;
		int charecter = 0, digit = 0, symbol = 0;
		int vowel = 0, consonants = 0, capital = 0, lower = 0;

		String[] abc = str.split(" ");
		for (int i = 0; i < abc.length; i++)
			word++;
		System.out.println("Number of Word : " + word);
		
		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			if (str.charAt(i) == ' ') {
			} else {
				charecter++;
			}
		}
		System.out.println("Number of Charecter : " + charecter);

		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowel++;
			} else if (str.charAt(i) == ' ') {
			} else {
				consonants++;
			}
		}
		System.out.println("Number of Vowel : " + vowel);
		System.out.println("Number of Consonants : " + consonants);

		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			if (str.charAt(i) == ' ') {
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				capital++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower++;
			} else if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
				digit++;
			} else {
				symbol++;
			}
		}
		System.out.println("Number of Capital letter : " + capital);
		System.out.println("Number of Lower letter : " + lower);
		System.out.println("Number of Digit : " + digit);
		System.out.println("Number of Symbol : " + symbol);
	}

}
