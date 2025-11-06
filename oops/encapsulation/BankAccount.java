package oops.encapsulation;

import java.util.Scanner;

public class BankAccount {
	private int balance;

	public int getBalence() {
		return balance;
	}

	public void SetBalence(int balence) {
		this.balance = balence;
	}

	public void Checkbalence() {
		System.out.println(balance);
	}

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited Successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(int amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount Withdrawn Successfully.");
		} else {
			System.out.println("Insufficient Balance or Invalid Amount.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount b = new BankAccount();
		b.SetBalence(10000);
		int choice;

		do {
			System.out.println("====== Bank Statement ======");
			System.out.println("1.check Balence.");
			System.out.println("2.Add balence.");
			System.out.println("3.Withdraw balence.");
			System.out.println("4.Exit");

			System.out.println("Enter your choice.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				b.Checkbalence();
				break;

			case 2:
				System.out.println("Enter your amount.");
				int Adddeposite = sc.nextInt();
				b.deposit(Adddeposite);
				break;

			case 3:
				System.out.println("Enter your amount.");
				int Addwithdraw = sc.nextInt();
				b.withdraw(Addwithdraw);
				break;
			case 4:
				System.out.println("Good By!.");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);

		sc.close();

	}

}
