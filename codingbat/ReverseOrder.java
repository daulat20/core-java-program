package codingbat;

import java.util.Arrays;

public class ReverseOrder {

//Given an array of ints length 3, return a new array with the elements in reverse order,
//		so {1, 2, 3} becomes {3, 2, 1}.
//reverse3([1, 2, 3]) → [3, 2, 1]
//reverse3([5, 11, 9]) → [9, 11, 5]
//reverse3([7, 0, 0]) → [0, 0, 7]

	public static void main(String[] args) {
		int[] arr = { 1,2,3 };

		for (int i = arr.length - 1; i > -1; i--) {

			System.out.print(+arr[i]+" ");
		}

	}

	
	
	
//	public static int[] reverse(int[] num) {
//
//		return new int[] { num[2], num[1], num[0] };
//	}
//
//	public static void main(String[] args) {
//		ReverseOrder r = new ReverseOrder();
//
//		System.out.println(Arrays.toString(reverse(new int[] { 1, 2, 3 })));
//		System.out.println(Arrays.toString(reverse(new int[] { 5, 11, 9 })));
//		System.out.println(Arrays.toString(reverse(new int[] { 7, 0, 0 })));
//
//	}

}
