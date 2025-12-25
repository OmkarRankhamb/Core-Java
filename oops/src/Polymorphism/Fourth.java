package Polymorphism;

public class Fourth {

	public static void main(String[] args) {

		person per = new Ram();
		person per1 = new Sham();

		per.action();
		per1.action();

	}
}

class person {
	public void action() {
		System.out.println("Some generic person action...");
	}
}

class Ram extends person {
	public void action() {
		System.out.println("Waking...");
	}
}

class Sham extends person {
	public void action() {
		System.out.println("seating...");
	}

}
