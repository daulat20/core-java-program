package Test;

import java.util.Scanner;
//WAP to accept 5 email ids and print their domain names only.
//For example:
//input: abhishek@gmail.com, leena@ymail.com, yash@outlook.co.in, rahul@yahoo.com, vishal@google.org
//output: gmail, ymail, outlook, yahoo, google

public class Question_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] emails = new String[5];

		System.out.println("Enter 5 email IDs:");
		for (int i = 0; i < emails.length; i++) {
			emails[i] = sc.next();
		}

		for (int i = 0; i < emails.length; i++) {
			
			System.out.println(emails[i].substring(emails[i].indexOf("@")+1 , emails[i].indexOf(".")));
		}
			

	}

}
