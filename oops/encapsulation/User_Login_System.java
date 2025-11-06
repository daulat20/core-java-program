package oops.encapsulation;

import java.util.Scanner;


public class User_Login_System {
	private String user_name;
	private long password;

	public String getUser_name() {
		return user_name;
	}

	public long getPassword() {
		return password;
	}

	public void setUser_name(String user_name) {

		this.user_name = user_name;
	}

	public void setPassword(long password) {

		this.password = password;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User_Login_System ul = new User_Login_System();

		System.out.println("Enter Username :");
		String user_name = sc.nextLine();

		System.out.println("Enter Password :");
		long password = sc.nextLong();

		if (user_name.equals("daulat") && password==12345l) {

			ul.setUser_name(user_name);
			ul.setPassword(password);

			ul.getUser_name();
			ul.getPassword();

			System.out.println("Login Successful." + user_name);

		} else {
			System.out.println("Invalid Username & Password.");
		}
		sc.close();

	}

}
