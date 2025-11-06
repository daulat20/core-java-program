package multitheading;

public class TableOf5 extends Thread {
	Table t;
	int num;

	TableOf5(Table t , int num){
		this.t=t;
		this.num=num;
	}
	

	@Override
	public void run() {
		t.printtable(num);
	}
}
