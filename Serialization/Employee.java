import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Employee extends Pearson {

	private String name;
	private int id;
	private String department;
	private double salary;

	Employee(String name, int id, String department, double salary, int age, long phone) {
		super(name, age, phone);
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

	public void display() {
		System.out.println("Name: " + name + ", ID: " + id + ", Dept: " + department + ", Salary: " + salary + ", age: "
				+ age + ", Phone no: " + phone);
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[2];
		for (int i = 0; i < e.length; i++) {
//			e[i] = new Employee();

			System.out.println("Enter name: ");
			String name = sc.nextLine();

			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter Department: ");
			String dept = sc.nextLine();

			System.out.println("Enter Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter phone: ");
			long phone = sc.nextLong();
			sc.nextLine();

			e[i] = new Employee(name, id, dept, salary, age, phone);
			System.out.println("==================================");
		}
//		e[0] = new Employee("daulat", 101, "IT", 250000);
//		e[1] = new Employee("Ashish", 102, "Hr", 20000);
//		e[2] = new Employee("Rahul", 103, "IT", 350000);

		FileOutputStream fo = new FileOutputStream("D:\\java\\employee.ser");
		ObjectOutputStream os = new ObjectOutputStream(fo);

		os.writeObject(e);
		os.close();
		System.out.println("Employee Data saved..");

		FileInputStream fi = new FileInputStream("D:\\java\\employee.ser");
		ObjectInputStream oi = new ObjectInputStream(fi);

		e = (Employee[]) oi.readObject();
		oi.close();

		System.out.println("\n ======Employees details========");
		double max = 0;
		int count = 0;
		for (int i = 0; i < e.length; i++) {
			e[i].display();

			if (e[i].salary > max)
				max = e[i].salary;

			if (e[i].department.equals("IT"))
				count++;
		}
		System.out.println("==================================");
		System.out.println("\n Highest salary:- " + max + "\n");
		System.out.println("==================================");

		System.out.println("Number of employees in IT department:" + count);
	}
}
