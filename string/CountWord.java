package string;

public class CountWord {
	public static void main(String[] args) {
		
		String str=("Hello My name is Daulat");
		int count=0;
		
		String[] abc = str.split(" ");
		for(int i=0;i<abc.length;i++) {
			count++;
			
		}System.out.println(count);
	}

}
