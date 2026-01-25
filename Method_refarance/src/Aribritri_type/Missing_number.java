package Aribritri_type;

import java.util.List;
import java.util.stream.IntStream;

public class Missing_number {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,3,4,5,8,9,10);
		
		IntStream.rangeClosed(1, 10)
		//.peek(System.out::println)
	
		.forEach(System.out::println);

	}

}
