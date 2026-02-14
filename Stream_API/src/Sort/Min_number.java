package Sort;

import java.util.List;

public class Min_number {

	public static void main(String[] args) {

		System.out.println(
		         List.of(12,34,32,2,78).
		       
		       stream().min((i,j)->{return Integer.compare(i, j);}));
		         
	}

}
