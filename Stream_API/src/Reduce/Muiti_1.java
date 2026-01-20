package Reduce;

import java.util.List;

public class Muiti_1 {

	public static void main(String[] args) {
		List<Integer> list=List.of(10,12);
			int Sum2=list.stream()
			.reduce(1,(a,b)->a*b);
			System.out.println(Sum2);
		

	}

}
