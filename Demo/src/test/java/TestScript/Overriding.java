package TestScript;

import java.io.IOException;
import java.sql.SQLException;

class Animal {
	public void move() throws IOException {
		System.out.println("Animals can move");
	}

}

class Dog extends Animal {
	 public void move() throws IOException {
		System.out.println("Dogs can walk and run");
	}
}

public class Overriding {
	public static void main(String args[]) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object
//		a.move(); // runs the method in Animal class
//		b.move(); // runs the method in Dog class
	}
}