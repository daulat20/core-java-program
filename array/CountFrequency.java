package Section2;

public class CountFrequency {
	public static void main(String[] args) {

		int arr[] = { 10,20,30,10,40,20,30,30};

		for (int i = 0; i < arr.length; i++) {
			boolean counted=false;
			
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					counted = true;
					break;
				}
			}
			if(counted)
				continue;
			
			
			int count = 1;

			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					count++;
				}
			}
			System.out.println(arr[i] + " -> " + count);

		}

	}

}
