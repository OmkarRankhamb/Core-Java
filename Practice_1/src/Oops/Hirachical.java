package Oops;

public class Hirachical {

	public static void main(String[] args) {
		monkey c = new monkey();
		c.PrintA();
		c.printC();

	}

}

class Cat {
	void PrintA() {
		System.out.println("bitting");
	}
}

class Dog extends Cat {
	void printB() {
		System.out.println("runiiing.......");
	}
}

class monkey extends Cat {
	void printC() {
		System.out.println("Cat is going.....");
	}
}
