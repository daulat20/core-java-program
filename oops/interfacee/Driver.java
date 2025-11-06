package oops.interfacee;

public class Driver {
	public static void main(String[] args) {

		PaymentGetway creadit = new CreaditCardPayment();
		PaymentGetway upi = new UpiPayment();

		creadit.processPayment(220.50);
		creadit.generateRecipt("vdf-dfgh-dgdg-345");
		

		System.out.println("=====Credit card Payment====");
		creadit.processPayment(220.50);
		System.out.println(creadit.generateRecipt("vdf-dfgh-dgdg-345"));
		System.out.println();

		System.out.println("=====UPI Payment====");
		upi.processPayment(234.54);
		System.out.println(upi.generateRecipt("654-546-dfg-354"));

	}

}
