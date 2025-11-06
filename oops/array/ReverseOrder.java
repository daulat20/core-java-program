package oops.array;

import java.util.Scanner;

// WAP to given 5 fruits name to user and print reverse order.

public class ReverseOrder {
	public static void main(String[] args) {
		String fruits[] = new String[5];
		String revers = "";
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < fruits.length; i++) {
			System.out.println("Enter fruit name.");
			fruits[i] = sc.next();
		}
		for (int i = fruits.length - 1; i >= 0; i--) {
			
            System.out.println(fruits[i]);
        }
	}

}
