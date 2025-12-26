package NoArgsConstructor;

public class First {

	public static void main(String[] args) {
		Loptop lp = new Loptop("Shiva ", "black", 121, 400000);
		lp.displayRecord();
	}

}

class Loptop {
	String name;
	String color;
	int number;
	double price;

	public Loptop(String name, String color, int number, double price) {
		this.name = name;
		this.color = color;
		this.number = number;
		this.price = price;
	}

	public void displayRecord() {
		System.out.println("name-"+name);
		System.out.println("color-"+color);
		System.out.println("number-"+number);
		System.out.println("price-"+price);

	}
}
