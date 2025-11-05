
public class MultiplicationTable {

	public static void main(String[] args) {
		
		int num=10;
		
		for(int i=1;i<=num;i++) {
			System.out.print("  ");
			for(int j=1;j<=num;j++) {
				System.out.print(i * j); 
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
