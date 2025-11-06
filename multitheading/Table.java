package multitheading;

public class Table {

	public synchronized void printtable(int n) {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(n + "x" + i + "=" + (n * i));

				Thread.sleep(100);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===================================");
	}

}
