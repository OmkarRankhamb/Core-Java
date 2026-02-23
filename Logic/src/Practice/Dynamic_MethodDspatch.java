package Practice;

public class Dynamic_MethodDspatch {

	public static void main(String[] args) {
		A a;
		
		a = new B();
		a.show();

		a = new C();
        a.show();

	}

}

class A {
	void show() {
		System.out.println("calling A");
	}
}

class B extends A {
	void show() {
		System.out.println("calling b....");
	}
}

class C extends A {
	void show() {
		System.out.println("calling c...");
	}
}
