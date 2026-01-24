package Static_Refarance;

import java.util.List;

public class Second {

	public static void main(String[] args) {
		List<Integer> list = List.of(2, 34, 6, 67);
		int sum = list.stream()
	             .map(i->Integer.valueOf(i).toString().length()).filter(add_I::add)
				.reduce(5, (i, j) -> i + j);
		System.out.println(sum);

	}

}

class add_I {
	public static boolean add(int i) {
		return i > 1;
	}
}