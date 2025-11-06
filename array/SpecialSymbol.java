package oops.array;

import java.util.Scanner;

//WAP to accept 10 characters from the user and count only special symbols.


public class SpecialSymbol {
	public static void main(String[] args) {
		char Mycharecter[] = new char[5];
		int count = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < Mycharecter.length; i++) {
			System.out.println("Enter Chareter or symbol");
			Mycharecter[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < Mycharecter.length; i++) {
			if (!(Mycharecter[i] >= '0' && Mycharecter[i] <= '9' || Mycharecter[i] >= 'a' && Mycharecter[i] <= 'z')) {
				count++;

			}
		}
		System.out.println(count);
	}

}
