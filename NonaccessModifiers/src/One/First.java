package One;

public class First {

	public static void main(String[] args) {
		static_gfg obj1 = new static_gfg();

		obj1.myMethod();

		static_gfg obj2 = new static_gfg();

		obj2.myMethod();
	}
}

class static_gfg {
	static int count = 0;

	void myMethod() {
		count++;
		System.out.println(count);
	}
}
