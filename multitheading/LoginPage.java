package multitheading;

import java.util.Scanner;

public class LoginPage {
	String password;
	long count = 0;

	public void login(String password) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		do {
			long start = System.currentTimeMillis(); // start timing

			System.out.println("Enter your Password");
			password = sc.nextLine();

			long end = System.currentTimeMillis(); // end time
			long totaltime = end - start;

			if (password.equals("12345")) {
				System.out.println("Login Successful...");

			} else {
				System.out.println("Incorrect Password...! Please Enter Coorect password");
				System.out.println(" Time taken: " + totaltime + " ms");
				for (int i = 0; i < totaltime; i++) {
					count++;
				}
			}
		} while (!password.equals("12345"));
		System.out.println("Total Count Timing for Login Page: " + count + " ms");
	}

}
