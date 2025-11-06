package multitheading;

public class UserBookseat extends Thread {
	 TicketBooking t1;
	int seat;

	UserBookseat(TicketBooking t1,String name,int seat) {
		super(name);
		this.t1 = t1;
		this.seat=seat;
	}

	public void run() {
		t1.bookseat(getName(),seat);
	}

}
