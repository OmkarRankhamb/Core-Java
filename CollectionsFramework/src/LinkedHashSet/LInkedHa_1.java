package LinkedHashSet;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LInkedHa_1 {
  public static void main(String [] args) {
	  List<Integer> list = new LinkedList<>();
	  
	  list.add(23);
	  list.add(78);
	  list.add(89);
	  list.add(12);
	  
	  System.out.println(list);
	  
	  ListIterator<Integer> ltr = list.listIterator();
	  
	  while(ltr.hasNext()) {
		  System.out.println(ltr.next());
		  
	  }
	  System.out.println("==========================");
		  
	  while(ltr.hasPrevious()) {
		  System.out.println(ltr.previous());
	  }
		  
		  
		  
		  
		  
	  
	  
  }
}
