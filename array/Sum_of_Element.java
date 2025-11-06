import java.util.Scanner;

public class Sum_of_Element {
	public static void main(String[] args) {

		int size, count = 0, sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		size = scanner.nextInt();

		int element[] = new int[size];
		System.out.println("Enter the number: ");
		for (int i = 0; i < element.length; i++) {
			element[i] = scanner.nextInt();
		}

		for (int i = 0; i < element.length; i++) {
			sum += element[i];
		}
		System.out.println(sum);
	}

}
