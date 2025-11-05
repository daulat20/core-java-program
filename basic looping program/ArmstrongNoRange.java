package Test1;

public class ArmstrongNoRange {
	public static void main(String[] args) {
		
		int num=0;
		int limit=5000;
		int rem;
		
		for (int i = 1; i < limit; i++) {
		int	sum=0;
			num=i;
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(i+" ");
			}
		}
	}

}
