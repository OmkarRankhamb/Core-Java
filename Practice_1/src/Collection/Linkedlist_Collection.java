package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_Collection {

	public static void main(String[] args) {
           LinkedList<Integer> list = new LinkedList<>();
           
        list.add(12);
   		list.add(23);
   		list.add(67);
   		list.add(87);
   		list.add(78);
   		list.add(null);
   		list.add(null);
   		list.add(12);
   		list.add(23);
   		list.add(67);
   		list.add(87);
   		list.add(32);
   		System.out.println(list);
   		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.clone());
		System.out.println(list.isEmpty());
		System.out.println(list.contains(list));
		System.out.println(list.lastIndexOf(list));
		System.out.println(list.removeFirst());
	
		Iterator<Integer> it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==============================");
		
      for( Integer num :list) {
    	  int value =(num != null)? num :0;
    	  System.out.println(value);
      }
}}
