package Distint;

import java.util.List;

public class Third {

	public static void main(String[] args) {
    
		
		List.of("acbc","dgsh","ueyr")
		.stream()
		.map(i->new StringBuffer(i).reverse().toString())
		.forEach(System .out::println);
	}

}
