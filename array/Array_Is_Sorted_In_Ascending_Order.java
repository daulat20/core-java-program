package Section2;

public class Array_Is_Sorted_In_Ascending_Order {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5, 6, 7 };

		boolean isSorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}

		if (isSorted)
			System.out.println("Array is Sorted in ascendig order...");
		else
			System.out.println("Array is Unsorted in ascendig order...");

	}

}
