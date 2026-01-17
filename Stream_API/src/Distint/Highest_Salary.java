package Distint;

import java.util.List;

public class Highest_Salary {

	public static void main(String[] args) {
		List.of(21212,2323,4545,567576,7887,89898)
		.stream().sorted((i,j)->Integer.compare(j, i)).peek(System.out::println).limit(4).skip(3)
		.forEach(System.out::println);

	}

}
