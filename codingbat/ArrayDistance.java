package codingbat;

public class ArrayDistance {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2 };
		int count = 3;
		int newarr[] = new int[arr.length - count];
		int j = 0;
		

		for (int i = count; i < arr.length; i++, j++) {
			newarr[j] = arr[i];
			System.out.print(newarr[j] + " ");
			
		}
	}
}
