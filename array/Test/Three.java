package Test;

public class Three {
	public static void main(String[] args) {
		
		String str = ("Apple,Plum,Papaya,Mango,Pomegranate,Pineapple,Melon,MuskMelon,Guava,watermelon");
		
		String[] fruits = str.split(",");
		for (int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);

			if (fruits[i].startsWith("P") || fruits[i].contains("M")||fruits[i].contains("m")) {
				int count = 0;

				for (int j = 0; j < fruits[i].length(); j++) {
					char ch = fruits[i].charAt(j);
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						count++;
					}
					
				}
				if(count>2) {
					System.out.println(fruits[i]);
				}
			}

		}

	}

}
