package Stream_ApI;

import java.util.List;


public class Second {

	public static void main(String[] args) {
		
		/*
		 * particular object add all String in last
		 */
		String s= "ka";
		List.of("Heloo","gelo","nahi","janar")
		.stream()
		.map(D->D.concat(s))
		.forEach(System.out::println);
		
		System.out.println("======================");
		
		/*
		 * add staring & last
		 */
		
		List.of("Heloo","gelo","nahi","janar")
		.stream()
		.map(p->"##"+p+"&&")
		.forEach(System.out::println);
	}

}
