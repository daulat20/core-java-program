package string;

public class Palindrome {
	public static void main(String[] args) {
		
		String str=("aba");
		String rev = "";
		for (int i = str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))
				System.out.println("String is Palindrome");
		else
			System.out.println("String is Not Palindrome");
	}

}
