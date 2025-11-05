
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 123;
		
		int digit=0;
		int revers=0;
		do {
			digit=num%10;
			revers = revers *10 +digit;
			num/=10;
			
		} while (num!=0);
		System.out.println(revers);
	}
}
