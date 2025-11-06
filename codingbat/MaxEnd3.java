package codingbat;

public class MaxEnd3 {
	public static void main(String[] args) {

		int[] arr = { 11, 2, 9, 12 };
		int last = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {

			if (arr[0] > last) {
				System.out.println(arr[0]);
			} else {
				System.out.println(last);
			}

		}
	}

}
