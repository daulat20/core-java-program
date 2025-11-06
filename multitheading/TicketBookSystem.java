package multitheading;

public class TicketBookSystem {
	public static void main(String[] args) throws InterruptedException {
		TicketBooking t1 =new TicketBooking(20);
		
		UserBookseat b1 = new UserBookseat(t1,"daulat",2);
		UserBookseat b2 = new UserBookseat(t1,"Ashish",10);
		UserBookseat b3 = new UserBookseat(t1,"rahul",25);
		UserBookseat b4 = new UserBookseat(t1,"Shubam",8);

		b1.start();
		b1.join();
		
		b2.start();
		b2.join();
		
		b3.start();
		b3.join();
		
		b4.start();
		b4.join();
		
	}

}
