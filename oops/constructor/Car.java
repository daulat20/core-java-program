package oops.constructor;

public class Car {

	public String name;
	public String color;

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Car() {
		name = "Alto";
		color = "black";
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car("Breeza", "Red");

		System.out.println(c1.name);
		System.out.println(c1.color + "\r");

		System.out.println(c2.name);
		System.out.println(c2.color);
	}
}
