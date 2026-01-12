package Lambda_1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class First_Loptop {

	public static void main(String[] args) {
		Loptop lp = new Loptop(111, "Dell", 7, 37000.0);
		Loptop lp1 = new Loptop(112, "Lonovo", 9, 86000.0);
		Loptop lp2 = new Loptop(113, "HP", 6, 96000.0);
		Loptop lp3 = new Loptop(114, "Samsung", 8, 90000.0);
		Loptop lp4 = new Loptop(115, "Asus", 9, 27000.0);
		Loptop lp5 = new Loptop(116, "Apple", 9, 100000.0);

		List<Loptop> list = List.of(lp, lp1, lp2, lp3, lp4, lp5);
		Predicate<Loptop> con = (i) -> {
			return i.name.length() > 2;
		};

		list.stream().filter(i -> i.name.length() > 2).forEach((i) -> {
			System.out.println(i.name + " " + i.number + " " + i.price + " " + i.Verson);
		});
		System.out.println("===============================");
		list.stream().filter(i -> i.price > 50000.0)
				.forEach(i -> 
				System.out.println(" name "+i.name +" Verson "+ i.Verson +" Number "+ i.number +" price "+ i.price));

	}
}

class Loptop {
	int number;
	String name;
	int Verson;
	double price;

	public Loptop(int number, String name, int Verson, double price) {
		this.number = number;
		this.name = name;
		this.Verson = Verson;
		this.price = price;

	}
}