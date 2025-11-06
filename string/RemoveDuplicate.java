//WAP to remove duplicate characters from a string.

package string;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = ("hello word");// heol wrd

		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char str1 = str.charAt(i);

			if (result.indexOf(str1) == -1) {
				result += str1;
			}

		}
		System.out.println("Without Duplicates: " + result);

	}

}
