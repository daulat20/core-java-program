package oops.interfacee;

public interface Shape {
	
	public void area();
	
	public static void main(String[] args) {
		Shape c = new Circle();
		c.area();
		
		Shape r = new Rectangle();
		r.area();
	}
}
