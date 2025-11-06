package oops.constructor;

import java.util.Scanner;

public class Friends {
	String name;
	String nickname;
	String type;
	private int age;
	private String address;
	private long phone;

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}

	public String getType() {
		return type;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public long getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Friends(String name, String nickname, String type, int age, String address, long phone) {
		this.name = name;
		this.nickname = nickname;
		this.type = type;
		this.age = age;
		this.address = address;
		this.phone = phone;

	}

	public Friends() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		this.name = sc.nextLine();

		System.out.println("Enter Nickname");
		this.nickname = sc.nextLine();

		System.out.println("Enter Type");
		this.type = sc.nextLine();

		System.out.println("Enter Age");
		this.age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Addres");
		this.address = sc.nextLine();

		System.out.println("Enter Phone number");
		this.phone = sc.nextLong();

		sc.close();
	}

	public void display() {
		System.out.println("Friends Name : " + name + " NickName : " + nickname + " Type : " + type + " Age : " + age
				+ " Address : " + address + " Phone number : " + phone);

	}

	
	/*  

	 * using toString method



	 * public String toString() { return "self [name=" + name + ", nickname=" +
	 * nickname + ", type=" + type + ", age=" + age + ", address=" + address +
	 * ", phone=" + phone + "]"; }
	 */
}
