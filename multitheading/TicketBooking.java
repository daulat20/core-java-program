package multitheading;

public class TicketBooking {
	int totalseat;

	TicketBooking(int totalseat) {
		this.totalseat = totalseat; 
	}

	public synchronized void bookseat(String name,int seat) { 
		try {
			System.out.println("Total Seat Available:" + totalseat + "\r");
			if (totalseat >= seat && seat > 0) {

				totalseat = totalseat - seat; 
				System.out.println(name+" booked seat:" + seat + ", Total left seat:" + totalseat);
				Thread.sleep(1000);
				System.out.println();
			} else {
				System.out.println(name+" booked seat:" + seat + "\rSeat can not be booked !"
						+ "\rTotal seat available is:" + totalseat);
				Thread.sleep(1000);
				System.out.println();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
