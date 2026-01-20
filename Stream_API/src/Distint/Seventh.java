package Distint;

import java.util.List;
import java.util.Optional;

public class Seventh {

	public static void main(String[] args) {
	List<Integer>	list=List.of(12,34,56,78,87,98,78,98,104,45,34);
		Optional<Integer>sum=list.stream()
		.distinct()
		.sorted((i,j)->Integer.compare(j, i))
		.reduce((i,j)->i+j);
		
		System.out.println(sum);
	

	}

}
