import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PearsonSaveData {
	public static void main(String[] args) throws Exception {
		FileOutputStream a = new FileOutputStream("D:\\Perason.ser");

		ObjectOutputStream b = new ObjectOutputStream(a);

		Pearson p1 = new Pearson("Daulat", 25, 7549238434l);
		Pearson p2 = new Pearson("Ashish", 24, 7448109284l);
		Pearson p3 = new Pearson("rahul", 23, 7955876245l);

		Student s1 = new Student("Adi", 19, 7498063701l);
		Student s2 = new Student("DMb", 25, 9657063701l);

		Employee e1 = new Employee("daulat", 1, "Hr", 20000, 19, 7498063701l);

		b.writeObject(p1);
		b.writeObject(p2);
		b.writeObject(p3);

		b.writeObject(s1);
		b.writeObject(s2);

		b.writeObject(e1);

		System.out.println("File saved...");
		b.close();

		FileInputStream fi = new FileInputStream("D:\\\\Perason.ser");

		ObjectInputStream oi = new ObjectInputStream(fi);
		p2= (Pearson) oi.readObject();
		p1 = (Pearson) oi.readObject();
		p3 = (Pearson) oi.readObject();

		s1 = (Student) oi.readObject();
		s2 = (Student) oi.readObject();

		e1 = (Employee) oi.readObject();
		

		System.out.println("Pearson data");
		System.out.println(p1.name + " " + p1.age + " " + p1.phone);
		System.out.println(p2.name + " " + p2.age + " " + p2.phone);
		System.out.println(p3.name + " " + p3.age + " " + p3.phone);

		System.out.println("\nEmployee data");
		System.out.println("Name: " + e1.getName() + ", " + " Id: " + e1.getId() + ", " + " Department: "
				+ e1.getDepartment() + ", " + " Salary: " + e1.getSalary() + ", " + " Age: " + e1.getAge() + ", "
				+ " Phone : " + e1.getPhone());
		
		System.out.println("\nStudent data");
		System.out.println("Name: "+s1.name + " " +" Age: "+ s1.age + " " +" Phone :"+ s1.phone);
		System.out.println("Name: "+s2.name + " " + " Age: "+s2.age + " " + " Phone :"+ s2.phone);

		

		oi.close();

	}

}
