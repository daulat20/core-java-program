package oops.constructor;

public class Book {
	public int id;
	public String name;
	
	public Book(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Book() {
		id=102;
		name="java";
	}
	public Book(int id) {
		this.id=id;
	}
	public Book(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		Book b1=new Book(101,"linux");
		Book b2=new Book();
		Book b3=new Book(103);
		Book b4=new Book("c#");
		
		System.out.println(b1.id);
		System.out.println(b1.name+"\r");
		
		System.out.println(b2.id);
		System.out.println(b2.name+"\r");
		
		System.out.println(b3.id+"\r");
		
		System.out.println(b4.name);
		
	}
}
