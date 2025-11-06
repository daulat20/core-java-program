package oops.interfacee;

interface a {
	void show(int num);
}

interface b {
	void display(int a, int b);
}

class Demo {
	void display() {
		System.out.println("hello");
	}
}

public class EvenOdd_Fibonacci_Test extends Demo implements a, b {
	public void show(int num) {

		if (num % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}

	public void display(int a, int b) {
		int num = 20;
		System.out.println();
		System.out.println("Fibonacci Series: ");
		for (int i = 1; i <= num; i++) {

			System.out.print(a + ", ");
			int temp = 0;
			temp = a + b;
			a = b;
			b = temp;
		}

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		t.show(12);
		t.display(1, 2);

	}
}
