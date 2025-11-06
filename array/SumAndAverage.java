
public class SumAndAverage {
	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int Array[]= {1,2,3,4,5,6,7};
		for (int i = 0; i < Array.length; i++) {
			
			sum+=Array[i];
			avg= sum / Array.length;
			
		}
		System.out.println("Sum of Array "+sum);
		System.out.println("Average of Array"+avg);
	}

}
