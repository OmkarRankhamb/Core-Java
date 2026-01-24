package Aribritri_type;

import java.util.List;
import java.util.stream.Collectors;

public class Same_elementprint_2 {

	public static void main(String[] args) {
		String sc ="acvdacv";
		
		String result = sc.chars().mapToObj(c->(char)c).distinct()
				.map((i)->new String().valueOf(i))
				.collect(Collectors.joining());
           System.out.println(result);
	}

}
