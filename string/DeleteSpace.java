package string;

import java.util.Iterator;

public class DeleteSpace {
	public static void main(String[] args) {
		
		String str=("Hello I am daulat BHutal");
		 
		String[] abc =str.split(" ");
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i]);
			
		}
	}

}
