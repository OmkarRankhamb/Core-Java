package Distint;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		List.of("121","212","1233")
		.stream()
		.map(i->new StringBuffer(i).reverse().toString().length()).distinct().skip(1)
		
		.forEach(System.out::println);
		

	}

}
