package One;

public class Vehicle {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();

	}

}
class vehicles{
	
}

abstract class vehicle {
	abstract void run();
}

class Bike extends vehicle {
	static int Wheels = 2;
	final int speedLimit = 90;
	volatile int count = 0;
	transient int password = 123;

	synchronized void run() {
		count++;
		System.out.println("Bike is running");
		System.out.println("Wheels :" + Wheels);
		System.out.println("speedLimit: " + speedLimit);
		System.out.println("password: " + password);

	}
}
