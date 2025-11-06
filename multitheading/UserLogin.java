package multitheading;

public class UserLogin extends Thread{
	LoginPage l;
	String password;
	
	UserLogin(LoginPage l,String password){
		this.l=l;
		this.password=password;
		
	}
	@Override
	public void run() {
			try {
				l.login(password);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}	

}
