package Sort;

import java.util.List;

public class Same_ElementPrint {

	public static void main(String[] args) {
		String sc  = "WEElCooMMEES";
		char  arr[] = sc.toCharArray();
		
		sc.chars()
		
		.mapToObj(c->(char)c).distinct().forEach(System.out::println);
	
		
	}

}
