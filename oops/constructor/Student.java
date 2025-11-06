package oops.constructor;

/*2. Create Student class with a few variables in it. Define parameterized constructor for the class.
 Create 1 object using that constructor and display the values. Also try to "CALL" default constructor.*/

public class Student {
	String name;
	int roll_no;
	String ph_no;

	public Student(String name, int roll_no, String ph_no) {
		this.name = name;
		this.roll_no = roll_no;
		this.ph_no = ph_no;
	}

	public static void main(String[] args) {

		Student s1 = new Student("daulat", 1, "7448109155");

		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		System.out.println(s1.ph_no);

	}
}
