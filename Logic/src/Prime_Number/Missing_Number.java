package Prime_Number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Missing_Number {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 6, 8);

		// IntStream.rangeClosed(1, 8)
		// .filter(i->!list.contains(i))
		for (int i = 2; i <= 8; i++) {

			if (!list.contains(i)) {
				System.out.println(i);
			}
		}

	}
}
