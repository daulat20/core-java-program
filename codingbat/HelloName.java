package codingbat;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String str=sc.nextLine();
		
		String str1=("Hello ");
		
		System.out.println(str1.concat(str));
	}
}
