
public class EvenOddNumber {
	public static void main(String[] args) {
		int[] array= {54,65,34,67,98,35};
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2==0)
				System.out.print("Even number "+ array[i]+" ");
			else {
				System.out.println("odd number "+ array[i]);
			}
		}
	}

}
