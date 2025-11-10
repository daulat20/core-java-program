import java.util.Scanner;

public class Delete_Element_FromArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {45,76,34,54,23,25,65,78};
		int n = arr.length;
		
		
		System.out.println("Enter Delet Element :");
		int del = sc.nextInt();
		
		int index = -1;
		
		System.out.println("Original Array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		for (int i = 0; i < n; i++) {
			if(arr[i]== del) {
				index= i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("\nElement not exist");
		}
		else {
			for (int i = index; i < n -1; i++) {
				
				arr[i]=arr[i+1];
			}
			n--;
			
			System.out.println("\nAfter the delete Element : "+del);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
