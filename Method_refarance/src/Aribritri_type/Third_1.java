package Aribritri_type;

import java.util.List;

public class Third_1 {

	public static void main(String[] args) {

		List<String> list = List.of("acb", "sfsasssssa", "swesygdfydsg", "qq", "wew");
		int sum = list.stream()

				.map(i -> new String(i).valueOf(i).length())
				.peek(System.out::println)
				.filter(i -> i > 2).reduce(0, (i, j) -> i + j);
                 System.out.println(sum);
	}

}
