import java.util.Scanner;

public class Mearge_Two_Array {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 7, 8, };
		int arr2[] = { 1, 2, 3, 4 };

		int newarr[] = new int[arr.length + arr2.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			newarr[index++] = arr[i] ;
		}
		for (int i = 0; i < arr2.length; i++) {
			newarr[index++] = arr2[i] ;
		}

		System.out.println("After inserting element :");
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}
	}

}
