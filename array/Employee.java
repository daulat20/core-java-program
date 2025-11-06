package oops.array;

//Task:
//Create a class employee as:
//
//class Employee {
//	name desg age gender phone email address
//	exp salary shift
//}
//
//Create an array of 5 employees. Perform the following:
//
//1. Print the names of all managers.
//2. Display contact details of all freshers
//3. Give hike of 10% in salary to all employees with exp more than 5 yrs.
//4. Find name and address of employees working in night shift.
//5. Remove employees with age above 55

public class Employee {

	String name;
	String desg;
	int age;
	String gender;
	long phone;
	String email;
	String address;
	int exp;
	 double salary;
	String shift;

	public Employee(String name, String desg, int age, String gender, long phone, String email, String address, int exp,
			 double salary, String shift) {
		this.name = name;
		this.desg = desg;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.exp = exp;
		this.salary = salary;
		this.shift = shift;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee("daulat", "IT Technician", 65, "Male", 7448109284l, "daulat@23.gmail.com",
				"Kolhapur", 4, 12000, "First");
		Employee e2 = new Employee("Ashish", "Systems Administrator", 56, "Male", 9486928475l, "ashish@23.gmail.com",
				"pune", 7, 20000, "Second");
		Employee e3 = new Employee("Rahul", "Software Engineer", 34, "Male", 9420397232l, "rahul@23.gmail.com", "akola",
				3, 12000, "US");
		Employee e4 = new Employee("Ajit", "IT Manager", 40, "Male", 9538247293l, "ajit@23.gmail.com", "sangli", 4,
				25000, "Night");
		Employee e5 = new Employee("Om", "IT Support Specialist", 25, "Male", 9634285947l, "om@23.gmail.com", "satara",
				0, 10000, "First");

		Employee ea[] = { e1, e2, e3, e4, e5 };
		
		
		System.out.println("Print the names of all managers.");
		for (int i = 0; i < ea.length; i++) {
			if (ea[i].desg.equals("IT Manager"))

				System.out.println(ea[i].name);
			
		}
		System.out.println();
		System.out.println("Display contact details of all freshers");
		for (int i = 0; i < ea.length; i++) {
			if (ea[i].exp == 0) {

				System.out.println(ea[i].phone);
				System.out.println(ea[i].email);
				System.out.println();
			}
		}
		System.out.println("Give hike of 10% in salary to all employees with exp more than 5 yrs");
		for (int i = 0; i < ea.length; i++) {
			if (ea[i].exp >5) {
				System.out.println("Original salary. "+(ea[i].salary));
				
				ea[i].salary =ea[i].salary * 1.10;
				System.out.println("Increment Salary by 10%");
				System.out.println((ea[i].salary));
				System.out.println();
			}
		}
		
		System.out.println("Find name and address of employees working in night shift");

		for (int i = 0; i < ea.length; i++) {
			if (ea[i].shift.equals("Night") ) {

				System.out.println(ea[i].name);
				System.out.println(ea[i].address);
			}
		}
		
		System.out.println("\n"+"Remove employees with age above 55");

		for (int i = 0; i < ea.length; i++) {
			if (ea[i].age >= 55 ) {
				System.out.println(ea[i].name+" : Above 55 years his retired.  ");
				continue;
				
			}
			System.out.println(ea[i].name);
		}
	}
}
