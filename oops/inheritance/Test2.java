package oops.inheritance;

public class Test2  extends Test{
	int a = 20;
	void show(int a) {
		super.show(40);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Test2 t =new Test2();
		t.show(30);
	}
}
