package oops.interfacee;

//Create an interface Bank with a method rateOfInterest(). 
//Implement it in SBI, ICICI, and AXIS classes. Print interest rates using dynamic method dispatch.
//

public interface Bank {
	double rateOfInterest();
}

class SBI implements Bank {

	@Override
	public double rateOfInterest() {
		return 6.5;
	}

}

class ICICI implements Bank {
	@Override
	public double rateOfInterest() {
		return 7.0;
	}

}

class AXIS implements Bank {
	@Override
	public double rateOfInterest() {
		return 8.0;
	}

}