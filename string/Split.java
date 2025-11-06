package string;

public class Split {
	public static void main(String[] args) {
		String str= "Welcome to java full stack programing.";
		String[] abc= {",", ";", "|", "\r", "\t" ,":"};
		String[] ab=str.split(" ");
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
	}

}
