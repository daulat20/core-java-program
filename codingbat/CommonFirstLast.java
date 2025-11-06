package codingbat;

public class CommonFirstLast {
	public boolean common(int[] a ,int[] b) {
			
		return a[0] == b[0] || a[a.length-1] == b[b.length-1];
	}
	public static void main(String[] args) {
		CommonFirstLast cf = new CommonFirstLast();
		int[] arr1= {1,2,3};
		int [] arr2= {7,3};
		System.out.println(cf.common(arr1, arr2));
		
		int[] arr3= {1,2,3};
		int [] arr4= {7,3,2};
		System.out.println(cf.common(arr3, arr4));
		
		int[] arr5= {1,2,3};
		int [] arr6= {1,3};
		System.out.println(cf.common(arr5, arr6));
		
		int[] arr7= {1};
		int [] arr8= {1};
		System.out.println(cf.common(arr7, arr8));
	}

}
