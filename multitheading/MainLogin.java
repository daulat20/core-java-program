package multitheading;

public class MainLogin {
	public static void main(String[] args) {
		LoginPage l = new LoginPage();

		UserLogin ul = new UserLogin(l, null);

		ul.start();
	}

}
