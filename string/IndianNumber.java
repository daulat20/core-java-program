package string;

import java.util.Scanner;

public class IndianNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number.");
		String number = sc.nextLine();
		
		if(number.length()==10){
			System.out.println("phone number :"+number);
			
			
		}
		else if(number.length()==12) {
			//String ccode= (String) number.subSequence(0, 2);
			if(number.subSequence(0, 2).equals("91")) {
				System.out.println("Indian Number.");
			}
			else
				System.out.println("Not Indian number");
		}
		else {
			System.out.println("Invalid Number");
		}
		
		
	}

}
