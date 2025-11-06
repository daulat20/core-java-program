package oops.interfacee;

public interface PaymentGetway {

	void processPayment(double amount);

	String generateRecipt(String transactionid);
}

class CreaditCardPayment implements PaymentGetway {

	public void processPayment(double amount) {
		System.out.println("Processing credit card payment : " + amount);

		System.out.println("Credit card payment Successful");
	}

	public String generateRecipt(String transactionid) {
		return "Credit card Payment Recipt : " + transactionid;
	}

}

class UpiPayment implements PaymentGetway {

	public void processPayment(double amount) {
		System.out.println("Processing UPI payment : " + amount);

		System.out.println("UPI payment Successful");
	}

	public String generateRecipt(String transactionid) {
		return "UPI Payment Recipt : " + transactionid;
	}

}