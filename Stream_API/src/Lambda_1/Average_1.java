package Lambda_1;

import java.util.List;

public class Average_1 {

	public static void main(String[] args) {
    List<Integer> list = List.of(11,12,13,14,15,16,17,18,19,20);
    
    double Average =list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    
    System.out.println(Average);
	}

}
