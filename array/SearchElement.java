import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int array[] = { 4, 6, 43, 6, 5, 7, 45, 6, 3 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");

		int num = sc.nextInt();
		boolean num1=false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {

				System.out.println("Element is Present in at index " + i);
				num1=true;
				break;
			}
		}
		if(!num1)
			System.out.println("Element is not Present index");
	}

}
