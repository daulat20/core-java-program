package Section2;

public class CountPositiveNegativeNumber {

	public static void main(String[] args) {

		int arr[] = { -45, 64, 34, -65, 643, -3, 87, -67, -34 };
		int poscount = 0;
		int negcount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				poscount++;

			else
				negcount++;
		}
		System.out.println("Positive number is : " + poscount);
		System.out.println("Negative number is : " + negcount);
	}

}
