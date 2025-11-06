package string;

public class PalindromNumber {
	public static void main(String[] args) {
		int num = 1221;

		int revers = 0;
		int temp = num;

		while (num != 0) {
			int rem = num % 10;
			revers = revers * 10 + rem;

			num = num / 10;
		}

		if (revers == temp) {
			System.out.println(revers + " : paledrom number");
		} else {
			System.out.println(revers + " : not paledrom number");
		}
	}

}
