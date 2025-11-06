package oops.constructor;

public class Classroom {

	String name;
	int id;
	static String course = "Java Full Stack";

	public Classroom(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public void display() {
		System.out.println("Name = " + name + " Id = " + id + " Course = " + course);

	}

	public static void main(String[] args) {

		Classroom c = new Classroom("Daulat", 101);
		c.display();
		
		Classroom c1 = new Classroom("Ashish", 102);
		c1.display();
		
		Classroom c2 = new Classroom("Rahul", 103);
		c2.display();
	}
}
