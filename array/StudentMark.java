import java.util.Scanner;

public class StudentMark {
	String Name;
	int marks[];

	public StudentMark(String name, int marks[]) {

		this.Name = name;
		this.marks = marks;

	}

	public int calculateAverage() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];

		}
		return sum / marks.length;
	}

	public String getGrade() {
		int avg = calculateAverage();
		if (avg >= 90) {
			return "A";
		} else if (avg >= 75) {
			return "B";
		} else if (avg >= 60)
			return "c";
		else
			return "Fail";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentMark[] sm = new StudentMark[3];

		for (int i = 0; i < sm.length; i++) {
			System.out.println("Enter name of student :");
			String name = sc.nextLine();

			int[] marks = new int[5];
			System.out.println("Enter marks for 5 subjects:");
			for (int j = 0; j < 5; j++) {
				System.out.print("Subject " + (j + 1) + ": ");
				marks[j] = sc.nextInt();
			}
			sc.nextLine();

			sm[i] = new StudentMark(name, marks);
		}

		for (int i = 0; i < sm.length; i++) {
			System.out.println("Name: " + sm[i].Name);
			System.out.println("Average Marks: " + sm[i].calculateAverage());
			System.out.println("Grade: " + sm[i].getGrade());
			System.out.println("-------------------------");
		}

	}

}
