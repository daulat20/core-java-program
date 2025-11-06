package oops.method_overloading;

public class Student {
	public Student(String name) {
		System.out.println(name);
	}

	private Student(String name, int age) {
		System.out.println(name + " "+age);
	}

	protected Student(String name, int age, String city) {
		System.out.println(name + " "+age + " "+city);
	}
	public static void main(String[] args) {
		Student s = new Student("sagar");
		Student s1 = new Student("Aditi", 20);
		Student s2 = new Student("daulat", 25, "kolhapur");
	}
}
