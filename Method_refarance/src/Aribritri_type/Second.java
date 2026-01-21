package Aribritri_type;

import java.util.List;

public class Second {

	public static void main(String[] args) {
		List.of("asd", "sda", "aasdas").stream().map(String::length)
				// .map(Math::sqrt)
				.map(Demi::add)

				.forEach(System.out::println);

	}

}

class Demi {
	public static int add(int i) {
		return i * i;
	}
}
