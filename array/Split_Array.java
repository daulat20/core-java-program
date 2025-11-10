import java.util.Iterator;

public class Split_Array {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70};
		int n = arr.length;
		
		int mid = n/2;
		int firstarr[]= new int [mid];
		int seconarr[]= new int[n-mid];
		
		System.out.println("Original array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i < mid; i++) {
		 	firstarr[i]=arr[i];
		}
		for (int i = mid; i<arr.length;i++) {
			seconarr[i-mid] = arr[i];
		}
		
		System.out.println("\nFirst Half : ");
		for (int i = 0; i < firstarr.length; i++) {
			System.out.print(firstarr[i]+" ");
		}
		System.out.println("\nSecond Half : ");
		for (int i = 0; i < seconarr.length; i++) {
			System.out.print(seconarr[i]+" ");
		}
	}

}
