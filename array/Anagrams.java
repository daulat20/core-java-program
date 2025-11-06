
public class Anagrams {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'd', 'c' };
		char[] arr2 = { 'a', 'c', 'd', 'b' };

		int count = 0;
		for (int i = 0; i < arr1.length; i++) {

			if (arr1.length == arr2.length) {
				for (int j = 0; j < arr2.length; j++) {

					if (arr1[i] == arr2[j]) {
						count++;
						break;
					}
				}

			} else {
				System.out.println("Both Arrays length's are not same.....! ");
				break;
			}

		}
		if (arr1.length == count) {
			System.out.println(" Anagram Arrays");
		} else {
			System.out.println(" Not an Anagram Arrays");
		}

	}
}
