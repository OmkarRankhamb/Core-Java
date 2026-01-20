package Reduce;

import java.util.List;

public class Sum_1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,34,65,87,54,43,5);
		int sum = list.stream()
				.reduce(0,(a,b)->a+b);
		System.out.println(sum);

	}

}
