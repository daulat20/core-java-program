package multitheading;

public class Practice extends Thread{
	
	@Override
	public void run() {
		System.out.println("welocome"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
//		System.out.println("hello daulat "+Thread.currentThread().getName());
		Practice p = new Practice();
		p.setName("dmb");
		p.start();
		System.out.println(p.isAlive( ));
		
		
	}

}
