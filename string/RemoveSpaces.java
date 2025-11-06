package string;

public class RemoveSpaces {
	public static void main(String[] args) {
		String str="daulat maruti bhutal";
		int i = 9;
		 char ocuurence = 'B';
		StringBuilder sb =new StringBuilder(str);
		sb.setCharAt(i, ocuurence);
		System.out.println(sb.toString());
	}

}
