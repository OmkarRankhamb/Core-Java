package Stream_ApI;

import java.util.List;

public class List_avg {

	public static void main(String[] args) {
		List<Integer>list=List.of(12,34,56,678,354,45);
		double avrage=list.stream().mapToInt(i->i.intValue()).average().orElse(0.0);
		
		System.out.println(avrage);
	}

}
