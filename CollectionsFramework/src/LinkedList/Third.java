package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Third {

	public static void main(String[] args) {
  List<Integer> list = new ArrayList<Integer>();
          
          list.add(67);
          list.add(45);
          
          System.out.println(list);
          System.out.println("First element "+list.get(1));
          list.set(0,34);
          System.out.println(list);
          System.out.print("list"+list.size());
          for(int num : list) {
        	  System.out.println(num);
          }
	}

}
