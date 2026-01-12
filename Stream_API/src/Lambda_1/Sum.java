package Lambda_1;

import java.util.List;
import java.util.function.Consumer;

public class Sum {

	public static void main(String[] args) {

		List<Integer> list = List.of(12,23,34,56,75,78,554,45,34);
		//System.out.println(list);
		
		Consumer<Integer> ctr =(i)->{System.out.println(i*22);};
	//	System.out.println(i);
		list.forEach(ctr);
		
		//list.stream().forEach(ctr);
	}

}
