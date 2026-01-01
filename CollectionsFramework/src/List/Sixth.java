package List;

import java.util.ArrayList;
import java.util.Objects;

public class Sixth {

	public static void main(String[] args) {
		ArrayList<Bike> car = new ArrayList<Bike>();

		Bike c1 = new Bike(1, 12000.0);
		Bike c2 = new Bike(1, 12000.0);

		car.add(c1);
		car.add(c2);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1.equals(c2));
		System.out.println(c2.hashCode());
	}
}

class Bike {
	int number;
	Double price;

	Bike(int number, Double price) {
		this.number = number;
		this.price = price;
	}

	public String ToString() {
		return this.number + " " + this.price;

	}

	public int hashCode() {
		return Objects.hash(number, price);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return number == other.number && Objects.equals(price, other.price);
	}

}
