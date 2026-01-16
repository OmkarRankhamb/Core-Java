package Sort;

import java.util.List;

public class Fifth {

	public static void main(String[] args) {
		System.out.println(
         List.of(12,34,32,2,78).
       
       stream().max((i,j)->{return Integer.compare(j, i);}));
         
         
	}

}
