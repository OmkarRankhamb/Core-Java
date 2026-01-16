package Lambda_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Revers_String {

	public static void main(String[] args) {
		
		List.of("Wellcome to pune ")
		.stream()
		.map(i->Arrays.stream(i.split(" "))
	    .map(p->new StringBuffer(p).reverse().toString())
		.collect(Collectors.joining(" "))).forEach(System.out::println);
		
	}

}
