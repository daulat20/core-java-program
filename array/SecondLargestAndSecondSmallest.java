//Find the second largest element in an array

public class Q6_SecondLargestAndSecondSmallest {
	public static void main(String[] args) {

		int arr[] = { 34, 549, 340, 123, 554, 6, 763, 87, 43 };

		int max = arr[0];
		int min = arr[0];

		int first = max;
		int second = min;
		
		System.out.println("Original Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\r ");

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i])
				max = arr[i];
			else if (min > arr[i])
				min = arr[i];
		}
		
//		find second Smallest number 
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] < first) {
				second = arr[i];
			}
		}
		System.out.println("Second Smallest number: " + second);

//		find second largest number

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second ) {
				second = arr[i];
			}
		}
		System.out.println("Second largest number: " + second);
	}

}
