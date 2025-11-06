package oops.abstraction;

//Shape Drawing Application:
//Create an abstract class 'Shape with an abstract method "draw()" and a concrete method '
//displayArea(double area).
//Create 'Rectangle' and 'Circle classes that implement draw() and calculate their areas. 
//Write a main program that allows the user to create and draw different shapes and
//display their areas.

abstract class Shape {
	abstract void draw();

	void displayArea(double area) {
		
		
		System.out.println("Area is : "+area);
	}

}
class Rectangle extends Shape{
	private double length;
	private double breadth;

	void draw() {
		System.out.println();
		System.out.println("Draw Rectangle.");
	}
	 Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	double calculatearea() {
		return length * breadth;
	}
	
}
class Circle extends Shape{
	private double radius;

	void draw() {
		System.out.println("Draw Circle.");

	}
	Circle(double radius){
		this.radius=radius;
	}
	double calculatearea() {
		return 3.1416*radius*radius;
	}
	
}