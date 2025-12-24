package Polymorphism;

public class Third {

	public static void main(String[] args) {
		PersanalAnimal myDog = new Dog();
		PersanalAnimal myCat = new Cat();

//		
		myDog.sound();
		myCat.sound();
	}
}

class PersanalAnimal {
	public void sound() {
		System.out.println("Some generic animal sound");
	}
}

class Dog extends PersanalAnimal {

	public void sound() {
		System.out.println("Bark!");
	}
}

class Cat extends PersanalAnimal {

	public void sound() {
		System.out.println("Meow!");
	}

}
