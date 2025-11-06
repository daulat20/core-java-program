package multitheading;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount b = new BankAccount(100);

        Deposit deposite1 = new Deposit(b, 1000);  
        Withdraw withdraw1 = new Withdraw(b, 1500); 

        Withdraw withdraw2 = new Withdraw(b, 700); 
        Deposit deposite2 = new Deposit(b, 200); 
        
        Deposit deposite3 = new Deposit(b, 200); 
        Withdraw withdraw3 = new Withdraw(b, 800); 
        
        deposite1.start();
        deposite1.join();
        
        withdraw1.start();
        withdraw1.join();
        
        withdraw2.start();
        withdraw2.join();
        
        deposite2.start();
        deposite2.join();

        deposite3.start();
        deposite3.join();
        
        withdraw3.start();
        withdraw3.join();
    }
}
