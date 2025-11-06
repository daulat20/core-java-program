package oops.method_overriding;

public class Home {
	public static void main(String[] args) {
		BaseAttendence ca = new ChiledAttendence();
		ca.attendence(2, "95 %", "java");
	}

}
