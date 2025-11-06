package oops.encapsulation;

import java.util.Scanner;

public class Employee_Salary_Management {
	private int salary;
	int id;
	String name;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void Display() {
		
		System.out.println("Employee Salary  :" +salary);
		System.out.println("Employee Id  :" +id);
		System.out.println("Employee Name  :" +name);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Salary_Management e=new Employee_Salary_Management();
		
		e.setId(101);
		e.setName("daulat");
		e.setSalary(20000);
		
		e.getId();
		e.getName();
		e.getSalary();
		
		e.Display();
	}
}
