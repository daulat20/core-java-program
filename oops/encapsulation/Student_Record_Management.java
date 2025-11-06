package oops.encapsulation;

import java.util.Scanner;

public class Student_Record_Management {
	String ph_no;
	String name;
	private int roll_no;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public void display(String name, String ph_no) {
		System.out.println("\n--- Student Record ---");
		
		System.out.println("Roll No    : " + roll_no);
		System.out.println("Name       : " + name);
		System.out.println("Phone No   : " + ph_no);
		System.out.println("=========================");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student_Record_Management s = new Student_Record_Management();
		int choice;
		
		do {
			System.out.print("Enter Student Roll Number: ");
			int roll_no = sc.nextInt();
			choice=roll_no;
			
			
			switch(choice) {
			
			case 1:
				s.setRoll_no(roll_no);
				System.out.println(s.getRoll_no());
				s.display("Daulat", "7448109155");
				break;
				
			case 2:
				s.setRoll_no(roll_no);
				System.out.println(s.getRoll_no());
				s.display("Sagar", "869458673");
				break;
				
			case 3:
				s.setRoll_no(roll_no);
				System.out.println(s.getRoll_no());
				s.display("Sachin", "7448943287");
				break;
				
			case 4:
				s.setRoll_no(roll_no);
				System.out.println(s.getRoll_no());
				s.display("Abhi", "9428716498");
				break;
			default :
				System.out.println(choice +" Roll number is not Available ");
			}
			
		} while (choice !=5);
		
		
		sc.close();
	}
}
