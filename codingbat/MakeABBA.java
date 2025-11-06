//Given two strings, a and b, return the result of putting them together in
//		the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//makeAbba("Hi", "Bye") → "HiByeByeHi"

package codingbat;

public class MakeABBA {
	public String makeabba(String a ,String b) {
		return 	a.concat(b).concat(b).concat(a);
	}
	public static void main(String[] args) {
//		String str=("hi");
//		String str1=("Bye");
//		System.out.println(str.concat(str1).concat(str1).concat(str));
		
		MakeABBA m = new MakeABBA();
		System.out.println(m.makeabba("Hi", "Daulat"));
		
	}

}
