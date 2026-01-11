package Intermadit_Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Second {

	public static void main(String[] args) {

		List<String> list = List.of("Abc", "Bcd", "bhy","Aes","uhy","Acd");
		
		
		list.stream().filter((i)->(i.startsWith("A"))).forEach(System.out::println);
		
		
		
		
	}

}

