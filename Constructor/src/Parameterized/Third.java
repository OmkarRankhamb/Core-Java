package Parameterized;

public class Third {

	public static void main(String[] args) {
        Loptop lp = new Loptop();
        lp.displayRecord();
	}

}

class Loptop {
	String Loptop_name;
	String Color;
	int Cor;
	Double Price;

	Loptop() {
		Loptop_name = "Lenovo";
		Color = "Black";
		Cor = 7;
		Price = 60000.0;

	}

	public void displayRecord() {

		System.out.println("name -" + Loptop_name);
		System.out.println("Color -" + Color);
        System.out.println("Cor -" + Cor);
        System.out.println("price -" + Price);

	}
}
