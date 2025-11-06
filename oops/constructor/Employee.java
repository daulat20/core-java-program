package oops.constructor;

import java.util.Scanner;

/*1. Create Employee class with a few variables in it. Define parameterized and non-parameterized constructor for 
the class. Create 1 object using each constructor and display the values.*/



public class Employee {

	private String Emp_name;
	private int Emp_id;
	private int salary;

	public Employee(String Emp_name, int Emp_id, int salary) {
		
		System.out.println("--------------------------------------------------------------------");

		this.Emp_name = Emp_name;
		this.Emp_id = Emp_id;
		this.salary = salary;

	}

	public Employee() {
		Emp_name = "Rahul";
		Emp_id = 102;
		salary = 120000;
	}

	public void display() {

		System.out.println("Employee name : " + Emp_name +" | "+ " Emplpoyee id : " + Emp_id +
				" | "+ " Salary : " + salary);
		System.out.println("--------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String Emp_name=sc.nextLine();
		
		System.out.println("Enter id");
		int Emp_id=sc.nextInt();
		
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		
		Employee e1 = new Employee(Emp_name, Emp_id, salary);
		Employee e2 = new Employee();
		
		
		
		e1.display();
		e2.display();
		sc.close();
	}
}
