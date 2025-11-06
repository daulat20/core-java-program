
public class Fibonacciseries {
	public static void main(String[] args) {
		
		int n =10;
		int first=1;
		int second=2;
		
		for(int i=0; i<=n;i++) {
			
			System.out.print(first +" ");
			int next=first+second;
			first=second;
			second = next;
			
		}
	}

}
