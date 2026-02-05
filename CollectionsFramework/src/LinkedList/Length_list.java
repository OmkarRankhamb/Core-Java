package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Length_list {

	public static void main(String[] args) {

//           ArrayList<String> list = new ArrayList<String>();   
//           
//           list.add("abcd");
//           list.add("bdhs");
//           
//           System.out.println(list.size());
//           		
           	
         List.of("adhghsj","gdsj")
         .stream().map(i->i.length()).forEach(System.out::println);
		
//		List.of(1.9)
//		.stream().map(i->i.SIZE).forEach(System.out::println);
		
//		ArrayList<Integer> list =  new ArrayList<>();
//		
//		list.add(12);
//		list.add(2);
//		
//		System.out.println(list.size());

		/*
		 * java.lang.ClassCastException line => 36
		 */
		
//		ArrayList<Integer> list = (ArrayList<Integer>) List.of(12,34,56);
//				list.stream().map(i->i.SIZE).forEach(System.out::println);
	}

}
