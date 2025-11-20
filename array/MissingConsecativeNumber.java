package Section2;

public class MissingConsecativeNumber {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5};
		int n = arr.length+1;
		
		int actualnum= n*(n+1)/2;
		System.out.println(actualnum);
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			temp+=arr[i];
		}
		int missingnum= actualnum- temp;
		System.out.println(missingnum);
	}

}
