package codingbat;

//Given an int array length 2, return true if it contains a 2 or a 3.
//has23([2, 5]) → true
//has23([4, 3]) → true
//has23([4, 5]) → false

public class Hash23 {
	public boolean hash23(int[] arr) {

		return arr[0] == 2 || arr[0] == 3 || arr[1] == 2 || arr[1] == 3;

	}
	public static void main(String[] args) {
		Hash23 h =new Hash23();
		int arr[]= {1,5};
		System.out.println( h.hash23(arr));
	}

}
