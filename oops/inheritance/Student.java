package oops.inheritance;

public class Student extends Pearson {
	String course;

	public Student(String course) {
		super();
		this.course=course;
		System.out.println(course);
		

	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
}
