package oops.interfacee;

//Write a program with an interface Payable having a method getPaymentAmount().
//Implement it in two classes: Invoice and Employee

interface Payable {
	double getPaymentAmount();
}

class Invoice implements Payable {
	private String item;
	private int quantity;
	private double pricePerItem;

	public Invoice(String item, int quantity, double pricePerItem) {
		this.item = item;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}

	void display() {
		System.out.println("Item = " + item);
		System.out.println("Quantity = " + quantity);
		System.out.println("Price Per Item = " + pricePerItem);
		System.out.println("Total Price = " + getPaymentAmount());
	}
}

class Employe implements Payable {
	private String name;
	private double salary;

	public Employe(String name, double Salary) {
		this.name = name;
		this.salary = Salary;
	}

	public double getPaymentAmount() {
		return salary;
	}

	void display() {
		System.out.println("Name = " + name);
		System.out.println("Salary = " + getPaymentAmount());
	}
}

public class Employee {
	public static void main(String[] args) {
		System.out.println("======Invoice Details======");
		Invoice i = new Invoice("keybord",5,250);
		i.display();
		System.out.println();
		System.out.println("======Employee Details======");

		Employe e = new Employe("daulat",2500000);
		e.display();
	}

}
