
public class Fibonacciseries {

	public static void main(String[] args) {
		
		int num=10;
		int first = 1;
		int second =2;
		int r =0;
		
		while(r<=num) {
			
			int next=first+second;
			first=second;
			second=next;
			
			r++;
			System.out.print(second + " ");
		}
	}
}
