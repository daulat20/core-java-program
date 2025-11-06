package oops.abstraction;

import java.util.Scanner;

public class MainShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("====Calculate Area & Draw Shape====");
		
		int choice=0;
		do {
			System.out.println();
			System.out.println("Choose your choice.");
			System.out.println("1.Draw Rectangle.");
			System.out.println("2.Draw Circle.");
			System.out.println("3.Exit");
			
			 choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter length.");
				double length = sc.nextDouble();

				System.out.println("Enter Breadth");
				double breadth = sc.nextDouble();

				Rectangle r = new Rectangle(length, breadth);
				r.draw();
				r.displayArea(r.calculatearea());

				break;
			case 2:
				System.out.println("Enter Radius.");
				double radius = sc.nextDouble();

				Circle c = new Circle(radius);
				c.draw();
				c.displayArea(c.calculatearea());
				break;
			}

		} while (choice < 3);
		sc.close();

	}

}
