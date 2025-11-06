package oops.interfacee;

public class BankIntrest {
	public static void main(String[] args) {
		Bank bank;
		bank = new SBI();
		System.out.println("SBI Intrest Rate: " + bank.rateOfInterest());
		
		bank=new ICICI();
		System.out.println("ICICI Intrest Rate: " + bank.rateOfInterest());

		bank=new AXIS();
		System.out.println("AXIS Intrest Rate: " + bank.rateOfInterest());

		
	}

}
