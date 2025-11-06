package oops.method_overloading;

public class  CalculatedofArea{
	// area of circle

	public void area(int r) {

		double area;
		area = 3.1416 * r * r;
		System.out.println("area of circle " + area);

	}

	public void area(int width, int length) {

		double area;

		area = width * length;

		System.out.println("area of Rectangle " + area);

	}
}
