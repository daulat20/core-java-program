//Multilevel inheritance

package oops.inheritance;

public class Dog {
	public void eat() {
		System.out.println("Animal eats food");
	}

}

class Sound extends Dog {
	public void sound() {
		System.out.println("Dog Barks");
	}

}

class Color extends Sound {
	public void colour() {
		System.out.println("black'n white");
	}
}
