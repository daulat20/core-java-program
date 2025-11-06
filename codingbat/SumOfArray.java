package codingbat;

public class SumOfArray {
	public static void main(String[] args) {

		int arr[] = { 1};
		int sum = 0;
		if (arr.length == 0) {
			System.out.println("0");

		} else if (arr.length < 2) {
			sum = arr[0];
			System.out.println(sum);

		} else {
			sum = arr[0] + arr[1];
			System.out.println(sum);
		}
	}

}
