package Intermadit_Operation;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		List<Integer>  list  = List.of(12,23,43,12,12);
		
		
		list.stream().forEach((i)->{System.out.println(i*2);});
		System.out.println("================================");
		
		list.stream().forEach((i)->{System.out.println(i+3);});
	}
	

}
