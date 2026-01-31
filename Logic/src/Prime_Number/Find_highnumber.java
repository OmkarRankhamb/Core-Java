package Prime_Number;

import java.util.List;
import java.util.Optional;

public class Find_highnumber {

	public static void main(String[] args) {
	List<Integer> list=	List.of(23,45,66,78,87);
    Optional<Integer> max= list.stream().reduce((i,j)->Integer.max(i, j));
		System.out.println(max.get());
		
//		.sorted((i,j)->Integer.compare(j, i))
//		//.peek(System.out::println)
//		.limit(1)
//		.forEach(System.out::println);
		
		
		
	}

}
