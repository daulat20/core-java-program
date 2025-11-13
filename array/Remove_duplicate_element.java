package Section2;

public class Remove_duplicate_element {

	public static void main(String[] args) {

		int arr[] = { 3,1,2,3,4,5,6,3,5,1,8,9 }; 
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			boolean duplicate=false;
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					duplicate =true;
					break;
				}
			}
			if(!duplicate) {
				
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}
}
