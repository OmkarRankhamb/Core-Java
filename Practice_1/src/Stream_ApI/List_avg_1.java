package Stream_ApI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List_avg_1 {

	public static void main(String[] args) {
		List<Integer> list =List.of(1,2,3,4,5,6,7,8,9,10);
		
  double avg= list.stream()
				
		//.mapToInt(i->i.intValue()).average().orElse(0.0);
	 .collect(Collectors.averagingInt(i->i.intValue()));
		System.out.println(avg);
	}

}
