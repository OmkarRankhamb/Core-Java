package Sort;

import java.util.List;

public class Revers_String {

	public static void main(String[] args) {

		List.of("abcd,cvds,cbnv,dshdj").stream()
		.map(i-> new StringBuffer(i).reverse().toString())
		.forEach(System.out::println);
	}

}
