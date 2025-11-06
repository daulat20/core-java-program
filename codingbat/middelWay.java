package codingbat;

public class middelWay {
	

//Given 2 int arrays, a and b, each length 3, return a new array length 2 
//		containing their middle elements.
//
//middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
		
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		
		int[] c = {a[1],b[1]};
		
		System.out.print("[");
		System.out.print(c[0]+","+c[1]);
		System.out.println("]");
	}

}
