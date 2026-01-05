package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashItretar_1 {
  public static void main(String []args) {
	  HashSet<Integer> set = new HashSet<>();
	  
	  set.add(56);
	  set.add(87);
	  set.add(12);
	  set.add(80);
	  set.add(32);
	  
	  Iterator<Integer> tr = set.iterator();
	  while(tr.hasNext()) {
		  
		  System.out.println(tr.next());
	  }
  }
}

