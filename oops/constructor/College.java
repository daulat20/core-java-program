package oops.constructor;

public class College {
	public static void main(String[] args) {
		Friends f1 = new Friends();
		System.out.println(f1);

		Friends f2 = new Friends("sagar", "s", "closefrd", 23, "pune", 86755454656l);
		Friends f3 = new Friends("Ravi", "r", "friend", 24, "pune", 86755454656l);
		Friends f4 = new Friends("sidhi", "s", "roommate", 23, "pune", 9685736254l);
		Friends f5 = new Friends("pandu", "p", "closefrd", 23, "pune", 86755454656l);

		/*System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);*/
		
		f2.display();
		f3.display();
		f4.display();
		f5.display();

	}
}
