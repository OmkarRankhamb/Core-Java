package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash_1 {
  public static void main(String []args ) {
	  Set<Integer> set = new LinkedHashSet<>();
	  
	  set.add(88);
	  set.add(45);
	  set.add(76);
	  set.add(null);
	  set.add(null);
	  set.add(76);
	  
	  System.out.println(set);
	  System.out.println(set.contains(76));
	  System.out.println(set.size());
	  System.out.println(set.isEmpty());
	  System.out.println(set.equals(set));
	  System.out.println(set.hashCode());
  }
}
