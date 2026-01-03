package Oops;

public class Abstraction_annomous {

	public static void main(String[] args) {
		Six s1 = new Six(101, "Ram") {

			void kk() {

				System.out.println("kk is printing....");

			}

		};
		s1.print();
		s1.kk();
	}
}

abstract class Six {
	int id;
	String name;

	public Six(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println("id :" + id);
		System.out.println("name :" + name);
	}

	abstract void kk();

}
