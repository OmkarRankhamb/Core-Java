package Distint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_String_3 {

	public static void main(String[] args) {

		List.of("Wellcome to pune")
		.stream()
	//	.map((i)->{return i.length();})
		.map(i-> new StringBuffer(i).reverse().toString().toUpperCase()).map(i->Arrays.stream(i.split(" ,"))
		.collect(Collectors.joining()))
		.forEach(System.out::println);
		
		
	}

}
