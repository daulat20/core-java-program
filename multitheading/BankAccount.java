package multitheading;

public class BankAccount {
	private double balance;
    BankAccount(double balence){
    	this.balance=balence;
    }

    public synchronized void deposit(double amount) {
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println(" deposited: " + amount + " | Balance: " + balance);
                Thread.sleep(1000);
            } else {
                System.out.println("Deposit amount must be greater than 0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void withdraw(double amount) {
        try {
            if (balance >= amount && amount > 0) {
                balance -= amount;
                System.out.println( " Withdraw: " + amount + " | Balance: " + balance);
                Thread.sleep(1000);
            } else {
                System.out.println(" tried to withdraw " + amount +" | Insufficient balance! Available: " + balance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
