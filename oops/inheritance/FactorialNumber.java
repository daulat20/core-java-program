package oops.inheritance;
import java.util.Scanner;

public class FactorialNumber extends PrimeNumber {
	
	public void factorial(int num) {
		super.primeNumber(num);
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :- ");
		int num = sc.nextInt();

		FactorialNumber pn = new FactorialNumber();
		

		pn.factorial(num);
		sc.close();
	}
}
