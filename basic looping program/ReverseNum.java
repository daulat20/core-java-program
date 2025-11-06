
public class ReverseNum {
	public static void main(String[] args) {
		
		int num=123;
		int reverse = 0;
		
		for(; num!=0;num/=10) {
			
			int digit = num %10;
			reverse=reverse*10+digit;
			
			
			
		}
		System.out.println("Reverse number is : " +reverse);
		
	}

}
