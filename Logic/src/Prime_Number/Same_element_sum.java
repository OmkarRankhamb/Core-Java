package Prime_Number;

import java.util.Collections;
import java.util.List;

public class Same_element_sum {

	public static void main(String[] args) {
	List<Integer> list=	List.of(12,23,45,56,12,34,56,78,23,10,12);
	
	int sum = list.stream()
			.filter(i->Collections.frequency(list,i)==1)
			.peek(System.out::println)
			.reduce(0,(i,j)->i+j);
	System.out.println(sum);
			
		

	}

}
