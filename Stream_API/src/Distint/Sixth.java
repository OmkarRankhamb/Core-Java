package Distint;

import java.util.List;

public class Sixth {

	public static void main(String[] args) {
		List.of(221,232,45,67,324,657,221,232)
		.stream()
		.filter(i->i<200).forEach(System.out::println);

	}

}
