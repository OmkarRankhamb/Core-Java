package abstraction;

public class Second {

	public static void main(String[] args) {

		City city = new City() {

			public void showpincode(String s) {
				System.out.println("hello:::" + s);
			}

			public void run_2() {
				System.out.println("running...");
			}

		};

		city.show();
		city.showpincode("12342");

	}

}

abstract class City {
	String name;

	public void show() {
		System.out.println(this.name);

	}

	abstract public void showpincode(String pin);

}
