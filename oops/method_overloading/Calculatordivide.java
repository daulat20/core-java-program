package oops.method_overloading;

public class Calculatordivide {
	public void divide(int  a,int b) {
		int sum=a/b;
		System.out.println("divide by Integer "+sum);
		
	}
	public void divide(double a,double b) {
		double sum = a/b;
		System.out.println("divide by doubles "+sum);
	}
	
	public static void main(String[] args) {
		Calculatordivide cd = new Calculatordivide();
		cd.divide(65, 8);
		cd.divide(65, 8f);
	}

}
