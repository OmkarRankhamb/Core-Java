package Inheritance;

public class First {
	public static void main(String[] args) {

		Human human = new omya();
		human.walk();

	}

}

class Human {

	public void walk() {
		System.out.println("human is walking...");
	}

	public void laugh() {
		System.out.println("he is laughing");
	}
}

/**
 * IS-A relation.
 */
class omya extends Human {
//	public void city()
//	{
//		System.out.println("pune");
//	}

}
