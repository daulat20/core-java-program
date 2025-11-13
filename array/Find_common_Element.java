package Section2;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_common_Element {
	public static void main(String[] args) {
		
		int arr1[]= {40,80,30,40,50,60,10};
		int arr2[]= {10,3,43,40,23,48,10,80,65,765,36,76,45,50}; 
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					h1.add(arr1[i]);
				}
			}
		}
		a.addAll(h1);
		
		System.out.println(a);
		
		
	}

}
