package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_1 {

	public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      
      list.add(12);
      list.add(78);
      list.add(null);
      list.add(23);
      list.add(null);
      list.add(76);
      list.add(98);
      list.add(1);
      list.add(null);
      
      
      System.out.println(list);
      System.out.println("=================================");
      
      Iterator<Integer> tr = list.iterator();
      {
    	  while(tr.hasNext())
    	  System.out.println(tr.next());
      }
      
	}

}
