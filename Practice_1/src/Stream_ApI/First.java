package Stream_ApI;

import java.util.List;

public class First {

	public static void main(String[] args) {
		/*
		 * Print same element
		 */
		
      List<Integer> list =List.of(10,20,30,40,50);
      List<Integer>list2 =List.of(20,10,60,70,30);
      
      List<Integer> list3=
      
      list.stream().filter(i->list2.contains(i))
   //   .filter(list2::contains)
      .toList();
      System.out.println(list3);
	}

}
