
public class UnitPlace {

	public void oddnum() {
		
		for(int i=1;i<=25; i+=2) {
			int result=i % 10;
			System.out.println("Unit place of digit "+i +" is "+result);
		}
	}
	
	public static void main(String[] args) {
		UnitPlace u =new UnitPlace();
		u.oddnum();
		}
}
