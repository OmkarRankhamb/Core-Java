package Lambda_1;

import java.util.List;

public class Revers_5 {

	public static void main(String[] args) {
		List.of("abvcdfd").stream().map(i -> new StringBuffer(i).reverse().toString()).forEach(System.out::println);

	}

}
