package oops.method_overriding;

public class Maneger extends Employee{
	String department;
	public void getdetails(String name,int id) {
		department="it";
		System.out.println("Name = "+name + " Id ="+id + " Department = "+ department);
	}
	public static void main(String[] args) {
		System.out.println("======= Details of Employee ====== ");
		Employee e = new Employee();
		e.getdetails("daulat", 25);
		System.out.println();
		
		
		
		System.out.println("======= Details of Maneger ====== ");
		Maneger m = new Maneger();
		m.getdetails("ashish", 23);
	}
}
