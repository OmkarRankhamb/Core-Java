package Sort;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Compretar_1 {

	public static void main(String[] args) {
		List<Integer> list=List.of(12,34,56,11,45);
		
	            list.stream().sorted((i,j)-> Integer.compare(j, i)).forEach(System.out::println);
	            


	}

}
