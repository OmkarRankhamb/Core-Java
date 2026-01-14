package Sort;

import java.util.Comparator;
import java.util.List;

public class Second {

	public static void main(String[] args) {
           List<Integer> list=List.of(38,43,54,11,22,47);
           
           list.stream().
           sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
