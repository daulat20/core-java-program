package oops.interfacee;

//Write an interface Vehicle with a method move().
//Implement this interface in Car and Bike classes and override the method.

 interface Vehical1 {
	void move();

}
class Car implements Vehical1{
	@Override
	public void move(){
		System.out.println("Move on the car.");
	}
}
class Bike implements Vehical1{
	@Override
	public void move(){
		System.out.println("Move on the Bike.");
	}
}
public class Vehical{
	public static void main(String[] args) {
		Car c =new Car();
		c.move();
		
		Bike b = new Bike();
		b.move();
	}
	
}