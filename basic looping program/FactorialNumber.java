
public class FactorialNumber {
	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		int r=1;
		
		do {
			
			fact*=r;
			r++;
		} while (r<=num);
		System.out.println(fact);
	}
}
