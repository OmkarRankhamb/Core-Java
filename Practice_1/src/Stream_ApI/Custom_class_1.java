package Stream_ApI;

import java.util.List;

public class Custom_class_1 {

	public static void main(String[] args) {
		List.of("abc","hdt","oip","pop")
		.stream()
		.map(Demo_1::get)
		
		.forEach(System.out::println);
	}

}

class Demo_1{
	public static String get(String i) {
		return new  StringBuffer(i).reverse()
		 .toString().toUpperCase().concat(i);
	}
	public static boolean set(boolean i) {
		return i;
	}
}
