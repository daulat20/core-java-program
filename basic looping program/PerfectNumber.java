
public class Perfectnumber {

	public static void main(String[] args) {
		
		int num =6;
		int sum=0;
		int r=1;
		do {
			if(num%2==0) {
				sum+=r;
			}
			
			
			r++;
		} while (r<=num /2);
		
		if(num==sum) {
			System.out.println(num+ " is a perfect number");
		}else
		{
			System.out.println(num+ " is a not perfect number");
		}
	}
}
