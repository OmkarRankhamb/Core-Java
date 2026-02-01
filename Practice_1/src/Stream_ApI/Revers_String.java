package Stream_ApI;

import java.util.List;

public class Revers_String {

	public static void main(String[] args) {
		List.of("hoka","Mam","hoiesp","rfvduuw")
		.stream()
		.map(i-> new StringBuffer(i).reverse().toString().length())
		.distinct()
		.skip(3)
		.forEach(System.out::println);

	}

}
