package Lambda_1;

import java.util.List;

public class Sum_2 {

	public static void main(String[] args) {
		List.of(12, 32, 43, 54, 11,"1111","1fsdhdjhsd",56, 123, 34, 176)
		.stream()
		.map( String::valueOf)
		//.map(i-> String.valueOf(i).s
		.filter(s->s.startsWith("1")).forEach(System.out::println);
	}

}
