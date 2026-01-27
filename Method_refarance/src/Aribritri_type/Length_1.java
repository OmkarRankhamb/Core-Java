package Aribritri_type;

import java.util.List;

public class Length_1 {

	public static void main(String[] args) {
		
		String s = "hello";
        List.of("acbd","asdasd","asdasd")
        .stream()
        .map(s ::concat)
        .peek(System.out::println)
        .map(String::toUpperCase)
        .peek(System.out::println)
        .map(String::length)
        .forEach(System.out::println);
	}

}
