package oops.interfacee;

import java.util.Scanner;
 interface CalculateIntrest{
	double bankintrest();
}

class Intrest implements CalculateIntrest{
	
	@Override
	public double bankintrest() {
		return 5;
	}
	void intrest(double amount,  double time) {
		double rate=bankintrest();
		double SI = (amount * rate * time) / 100;
		System.out.println();
		System.out.println("Your Interst Amount is = "+SI);
	}

}

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount : ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter your Intrest month : ");
		double time = sc.nextDouble();
			
		Intrest i = new Intrest();
		i.intrest(amount, time);
			
				sc.close();
	}

}
