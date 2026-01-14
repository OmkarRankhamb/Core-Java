package Sort;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
       List<String>list =List.of("abc","bcde","opmn");
       
       list.stream().map((i)->{return new StringBuffer(i).reverse().toString();})
       .forEach(System.out::println);
	}

}
