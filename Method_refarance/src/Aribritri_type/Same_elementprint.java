package Aribritri_type;

import java.util.List;

public class Same_elementprint {

	public static void main(String[] args) {
		String cd = "WEElCooMMEES";
         char arr [] = cd.toCharArray();
         
         
         cd.chars().mapToObj(c->(char)c).distinct().forEach(System.out::println);
	}

}
