package Lambda_1;

import java.util.List;

public class Average_map {

	public static void main(String[] args) {
		List<Integer> number =List.of(1,2,3,4,5,6,7,8,9,10);
		
		double average =number.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		
		System.out.println(average);

	}

}
