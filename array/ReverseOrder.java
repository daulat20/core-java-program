import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		int arr[]=new int[3];
		
		for(int i=0; i<arr.length;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			 arr[i]=sc.nextInt();
		}
		
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
