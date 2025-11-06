package codingbat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {

	private String name;
	private int id;
	private String department;
	private double salary;

	public Employee(String name, int id, String department, double salary) {

		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void Display() {
		System.out.println("Name :- " + name + " ,Id :- " + id + " ,Department :- " + department + " ,Salary :- " + salary);
	}

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		Employee[] employee = new Employee[2];				//Dynamic array
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Enter the details of employee : " + (i + 1));

			System.out.println("Enter name : ");
			String name = scanner.next();
			scanner.nextLine();

			System.out.println("Enter id : ");
			int id = scanner.nextInt();

			System.out.println("Enter department : ");
			String department = scanner.next();
			scanner.nextLine();

			System.out.println("Enter salary : ");
			double salary = scanner.nextDouble();
			scanner.nextLine();

			employee[i] = new Employee(name, id, department, salary);
		}

		System.out.println("Printing employee Details : ");
		
			FileOutputStream fileOutput = new FileOutputStream("D:\\Employee.ser");
			
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
			
			outputStream.writeObject(employee);
			
			fileOutput.close();
			outputStream.close();
			System.out.println("Employee file created successfuly...");
			
			FileInputStream inputStream = new FileInputStream("D:\\Employee.ser");
			
			ObjectInputStream object = new ObjectInputStream(inputStream);
			
			Employee[] e= (Employee[]) object.readObject();
			object.close();
			
			for (int i = 0; i < employee.length; i++) {
				employee[i].Display();
			}
			
		
	}
}
