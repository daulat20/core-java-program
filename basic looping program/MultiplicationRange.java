import java.util.Scanner;

public class MultiplicationRange {
	private int num;
	int range=2;
	
	public int getNum() {
		 
		 System.out.println("Multiplication table:");
		while(range<=10) {
			 for(int i=1;i<=num;i++) {
				
				 
				System.out.print(i*range +"   ");
				
			 }
			System.out.println(num * range + " ");
			range++;
		}
		return num;
	}
	
	public void setNum(int num) {
		this.num=num;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MultiplicationRange m = new MultiplicationRange();
		
		System.out.println("Enter number :");
		int result=sc.nextInt();
		m.setNum(result);
		
		 m.getNum();
		
		
		sc.close();
	}
}
