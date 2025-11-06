
public class MaxMinNumber {
	public static void main(String[] args) {
		int Array[]= {43,56,3,34,54,34,23,65,5};
		int max=0;
		int min=Array[0];
		
		for (int i = 0; i < Array.length; i++) {
			if(Array[i]> max) {
				max=Array[i];
			}
			else if(Array[i]< min){
				min=Array[i];
			}
				
		}
		System.out.println(max);
		System.out.println(min);
	}

}
