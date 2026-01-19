package Distint;

import java.util.List;

public class Fifth {

	public static void main(String[] args) {
           
		List.of(212,343,5656,87,13,454,664)
		.stream()
		.sorted((i,j)->Integer.compare(j, i)).skip(2).forEach(System.out::println);
	}

}
