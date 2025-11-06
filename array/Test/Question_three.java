package Test;

import java.util.Scanner;

//WAP to accept names of 10 fruits of your choice.
//Print only those fruit names which starts with either 'P' or has 'M' in it and
//no of vowels in the fruit name is more than two.

public class Question_three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] fruits = new String[10];

		System.out.println("Enter 10 Fruits Name:");
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = sc.next();

		}
		for (int i = 0; i < fruits.length; i++) {
			int count=0;
			if (fruits[i].startsWith("P") || fruits[i].contains("M") ||fruits[i].contains("m")) {
					//System.out.println(fruits[i]);
					for (int j = 0; j < fruits[i].length(); j++) {
						char ch = fruits[i].charAt(j);
						if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
							count++;
						}

					}
					if (count > 2) {
						System.out.println(fruits[i]);
					}

			}

		}

	}

}
