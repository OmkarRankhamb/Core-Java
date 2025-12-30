package One;

public class Abstract {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myMethod();
	}

}

abstract class abstract_gfg {
	abstract void myMethod();
}

class MyClass extends abstract_gfg {

	void myMethod() {
		System.out.println("JavaPrograming");
	}
}