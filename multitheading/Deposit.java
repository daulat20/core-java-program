package multitheading;

public class Deposit extends Thread {
	private BankAccount b;
	private double amount;

    Deposit(BankAccount b, double amount) {
        this.b = b;
        this.amount = amount;
    }

    @Override
    public void run() {
        b.deposit(amount);
    }
}
