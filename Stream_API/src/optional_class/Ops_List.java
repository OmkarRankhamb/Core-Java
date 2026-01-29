package optional_class;

import java.util.List;
import java.util.Optional;

public class Ops_List {

	public static void main(String[] args) {

		Optional<Integer> ops = List.of(12, 34, 45).stream()
				/*
				 * only one  Min or Max use 
				 */
				//.max((i,j)->Integer.compare(i, j));
				.min((i, j) -> Integer.compare(i, j));
		System.out.println("Min => " + ops.get());

		System.out.println("**************************************************");

		Optional<Integer> op = List.of(10, 20, 20)
		.stream().reduce((i, j) -> i * j);
		System.out.println("Multi => " + op.get());

		System.out.println("************************************************************");

		Optional<Integer> ops1 = List.of(12, 34, 56, 11)
				.stream()
				.max((i, j) -> Integer.compare(i, j));
		System.out.println("Max => " + ops1.get());

		System.out.println("*****************************************************************");

		Optional<Integer> pp = List.of(23, 47, 847, 87456)

				.stream()
				.reduce((i, j) -> i + j);
		System.out.println("sum => " + pp.get());

	}

}
