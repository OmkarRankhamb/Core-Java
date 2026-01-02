package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class First {

	public static void main(String[] args) {
     LinkedList<Integer> list = new LinkedList<Integer>();
     
     
     list.add(22);
     list.add(23);
     list.add(24);
     list.add(25);
     
     System.out.println(list);
     System.out.println(list.equals(2));
     System.out.println(list.size());
     System.out.println(list.lastIndexOf(list));
     System.out.println(list.hashCode());
     
	}

}
