//Find the index of a given element

public class FindindexOfElement {

	public static void main(String[] args) {
		
		int arr[]= {45,34,645,87,45,3,5,35};
		int target = 3;
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				index = i;
				break;
			}
		}
		if(index != -1) 
			 System.out.println("Element " + target + " found at index: " + index);
        else
            System.out.println("Element " + target + " not found in array.");
		
	}
}
