package oops.method_overloading;

public class Calculator {

	 void Add(int a, int b) {
		
		System.out.println("a+b = " + (a + b));

	}
	private void Add(int a,int b,int c) {
		System.out.println("a+b+c = "+ (a+b+c));
	}
	
	public void Add(String a, String b) {
		System.out.println(a+b);
	}
	protected void Add(char a , char b) {
		System.out.println("ASCII value = "+(a+b));
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.Add(5, 7);
		c.Add('a', 'b');
		c.Add("a", "b");
		c.Add(3, 40, 5);
		
	}

}