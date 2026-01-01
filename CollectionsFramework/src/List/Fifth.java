package List;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Fifth {

	public static void main(String[] args) {
		LocalDateTime Date1 = LocalDateTime.of(2002, 4, 44, 43, 45);
		LocalDateTime Date2 = LocalDateTime.of(2003, 5, 67, 34, 8);
		HashSet<Sportcar> set = new HashSet<Sportcar>();

		Sportcar mustang = new Sportcar(233.455, "ford-mus", new LocalDateTime[] { Date1, Date2 });
		Sportcar mustang2 = new Sportcar(233.455, "ford-mus", new LocalDateTime[] { Date1, Date2 });

		set.add(mustang);
		set.add(mustang2);

		System.out.println(set);
		System.out.println(mustang);
		System.out.println(mustang.hashCode());
	}
}

class Sportcar {
	double price;
	String name;
	LocalDateTime[] servicings;

	public Sportcar(double price, String name, LocalDateTime[] localDateTimes) {
		this.price = price;
		this.name = name;
		this.servicings = localDateTimes;
	}

	public String toString() {

		StringBuffer s = new StringBuffer();
		for (LocalDateTime local : servicings) {

			s.append(local.toString());
		}
		return this.name + " " + this.price + " " + s;
	}

}
