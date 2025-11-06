package oops.method_overriding;

public class Bike extends Vehicle{
	public void run() {
		super.run();
		System.out.println("Maximum Bike speed 120");
	}
	public static void main(String[] args) {
		
		
		Bike  b =new  Bike();
		b.run();
	}
}
