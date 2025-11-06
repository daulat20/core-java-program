import java.util.Scanner;

public class ValidEmail {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Email id : ");
			String emails = sc.nextLine();

			if(!(emails.contains("@"))) {
			 throw new Exception();
			}

			System.out.println(emails.substring(emails.indexOf("@")));

		} catch (Exception e) {
			System.out.println("Invalid Emails");
		}

	}

}
