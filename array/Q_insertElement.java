//Insert an element at a specific position

import java.util.Iterator;
import java.util.Scanner;

public class Q_insertElement {

	public static void main(String[] args) {
		
		int arr[]= {34,65,34,556,34,54,65,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Element :");
		int element = sc.nextInt();
		System.out.println("Enter a position :");
		int position = sc.nextInt();
		
		System.out.println("original Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int newarr[]= new int[arr.length+1];

		for (int i = 0; i < position; i++) {
			newarr[i]=arr[i];
		}
		newarr[position]=element;
		
		for (int i = position; i < arr.length; i++) {
			newarr[i+1]=arr[i];
			
		}
		
		System.out.println("After inserting element :");
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]+" ");
		}
	}
}
