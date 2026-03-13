package Practice;

public class Dynamic_1 {

	public static void main(String[] args) {
	AB a;
		
		a = new CD();
		a.show();

		a = new de();
        a.show();

	}

}

class AB {
	void show() {
		System.out.println("calling A");
	}
}

class CD extends AB {
	void show() {
		System.out.println("calling BC....");
	}
}

class de extends AB {
	void show() {
		System.out.println("calling de...");
	}
}

