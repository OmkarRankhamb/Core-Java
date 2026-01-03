package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
         Vector<String> vec = new Vector<>();
         
           vec.add("A");
           vec.add("B");
           vec.add("C");
           vec.add("A");
           vec.add("D");
           vec.add("U");
           vec.add("K");
           vec.add("P");
           vec.add("T");
           vec.add("A");
           vec.add(null);
           vec.add(null);
           System.out.println(vec);
           System.out.println(vec.clone());
           System.out.println(vec.getLast());
           System.out.println(vec.reversed());
           System.out.println(vec.size());
           System.out.println(vec.firstElement());
           
           System.out.println("==============================");
           Iterator<String> tr =vec.iterator();
           while(tr.hasNext()) {
           System.out.println(tr.next());
           
           System.out.println("***********************");
           for(String i : vec) {
        	   System.out.println(i);
        	   
           }
	}
	}
}
