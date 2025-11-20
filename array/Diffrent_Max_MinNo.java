package Section2;

public class Diffrent_Max_MinNo {
	public static void main(String[] args) {
		
		int arr[]= {32,34,5,376,98,67,34,87,82};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else {
				min = arr[i];
			}
		}
		System.out.println("Diffrent between Maximum and minimun number :"+ (max - min));
	}

}
