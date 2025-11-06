package oops.method_overriding;

public class ChiledAttendence extends BaseAttendence {
	@Override
	public void attendence(int id) {
		System.out.println("Studnt Id :" + id);
	}

	@Override
	 void attendence(int id, String day) {
		System.out.println("Studnt Id :" + id + " date :" + day);
	}

	@Override
	protected void attendence(int id, String day, String subject) {
		super.attendence(1, "75 %", "marathi");
		System.out.println("=============Today Attendence=============");
		System.out.println("Today \r "+"Studnt Id :" + id  + " Present Day :" + day + " Subject " + subject);
		
	}

}
