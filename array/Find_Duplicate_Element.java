package Section2;
import java.util.ArrayList;
import java.util.HashSet;

public class Find_Duplicate_Element {
	public static void main(String[] args) {

		int arr[] = { 2, 8, 3, 4, 5, 43, 2, 43, 5, 8, 9, 2, 7 };

		HashSet<Integer> h = new HashSet<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			h.add(arr[i]);
		}
		a.addAll(h);

		for (int j = 0; j < a.size(); j++) {
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if (a.get(j) == arr[i]) {
					count++;
				}

			}
			if(count >1) {
				System.out.println(a.get(j));
			}

		}
	}

}
