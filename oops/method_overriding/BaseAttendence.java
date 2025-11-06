package oops.method_overriding;

public class BaseAttendence {
	
	public void attendence(int id) {
		System.out.println("Studnt Id :"+ id);
	}
	void attendence(int id , String day) {
		System.out.println("Studnt Id :"+ id + " day :"+day);
	}

	 void attendence(int id , String day,String subject) {
		System.out.println("=============Old Attendence=============" );
		System.out.println("Studnt Id :"+ id + "Present Day :"+day+ " Subject "+subject);
	}
}
