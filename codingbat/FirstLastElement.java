package codingbat;

public class FirstLastElement {
	

//Given an array of ints, return a new array length 2 containing the first and
//		last elements from the original array. The original array will be length 1 or more.
//makeEnds([1, 2, 3]) → [1, 3]
		
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		System.out.println(arr[0] + ","+ arr[arr.length-1]);
	}

}
