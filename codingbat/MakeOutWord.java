package codingbat;
//Given an "out" string length 4, such as "<<>>", and a word,

//return a new string where the word is in the middle of the out string,
//e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting 
//at index i and going up to but not including index j.
//
//makeOutWord("<<>>", "Yay") → "<<Yay>>"

public class MakeOutWord {
	
	public static void main(String[] args) {
		String out="<<>>";
		String str="word";
		String result= (""+out.charAt(0) + out.charAt(1)) + str + out.charAt(2) + out.charAt(3);
		System.out.println(result);
	}

}
