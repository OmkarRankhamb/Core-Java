package Lambda_1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map_3 {

	public static void main(String[] args) {
   
		List<String> list=List.of("Pune","Mumbai","Latur","Dharasiv");
		/*
		 * String Length
		 */
		
		

		Map <String , Integer> map= list.stream().collect(Collectors.toMap(s-> s,String::length));
		
		System.out.println(map);
		
		Function<String , Integer> fun=(i)->{return i.length();};
		
		list.stream().map(fun).forEach(System.out::println);
		
	}

}
