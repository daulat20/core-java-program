package multitheading;

public class Withdraw extends Thread {
	private BankAccount b;
	private  double amount;

    Withdraw(BankAccount b, double amount) {
        this.b = b;
        this.amount = amount;
    }

    @Override
    public void run() {
        b.withdraw(amount);
    }
}
