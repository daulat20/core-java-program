
public class Leapyear {

	public static void main(String[] args) {
		
		int lastyear=2025;
		int firstyear=1953;
		
		do {
			
			if (firstyear % 4 == 0)
			{
				System.out.print(firstyear+ " ");
				
			}
			
			firstyear++;
		} while (firstyear<=lastyear);
	}
}
