package Reduce;

import java.util.List;

public class Custom_Class_2 {

	public static void main(String[] args) {
		
      List.of(1212,32434,5656,767,565)
        .stream()
    	.reduce((a,b)->a+b);
      //  .sorted((a,b)->a+b).forEach(System.out::println);
       //  .reduce(Integer::sum);
      //   System.out.println(list);
         
	}

}
