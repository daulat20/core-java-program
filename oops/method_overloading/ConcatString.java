package oops.method_overloading;

public class ConcatString {

	public void AddString(String a, String b) {

		String add = a + b;

		System.out.println("Concat 2 String ="+add);
	}

	public void AddString(String a, String b, String c) {

		String add = a + b + c;

		System.out.println("Concat 3 String ="+add);
	}

	public void AddString(String a, int b) {

		String add = a + b;

		System.out.println("Concat 1 String & 1 Integer ="+add);
	}
	public static void main(String[] args) {
		ConcatString cs =new ConcatString();
		cs.AddString("A", "B");
		cs.AddString("a", "b", "c");
		cs.AddString("A", 50);
	}

}
