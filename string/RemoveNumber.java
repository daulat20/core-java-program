package string;

public class RemoveNumber {
	public static void main(String[] args) {
		String str = ("d1a2u3l4a5t6");
	
//		System.out.println(str.replaceAll("[0-9]", ""));
		for (int i = 0; i < str.length(); i++) {
			char result= str.charAt(i);
			if(!(str.charAt(i)>'0' && str.charAt(i) <'9')) {
				System.out.print(result);
			}
		}

	}

}
