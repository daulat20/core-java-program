package Section2;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int li = 0;
		int hi = arr.length - 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Search Element :");
		int element = sc.nextInt();
		boolean found = false;

		while (li <= hi) {
			int mid =(li + hi) / 2;

			if (arr[mid] == element) {
				System.out.println("Element found at index: " + mid);
				found = true;
				break;
			} else if (arr[mid] < element) {
				li = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		
		if(!found) {
			System.out.println("Element not found");
		}

	}

}
