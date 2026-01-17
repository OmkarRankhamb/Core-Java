package Distint;

import java.util.List;

public class String_Reverse {

	public static void main(String[] args) {
		List.of("abc","cdef","sfga")
		.stream()
		.map(i-> new StringBuffer(i).append(i).reverse().toString()).forEach(i->System.out.println(i));
		
		
		
		
		
//		.map(StringBuffer::new)
//		.map(StringBuffer::reverse)
//		.map(StringBuffer::toString).forEach(System.out::println);
//		

	}

}
