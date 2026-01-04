package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasgSet_1 {

	public static void main(String[] args) {
       Set<Integer> set = new HashSet<>();
       
       set.add(23);
       set.add(null);
       set.add(56);
       set.add(67);
       set.add(67);
       set.add(12);
       
       
       System.out.println(set);
       System.out.println(set.remove(12));
       System.out.println(set);
       System.out.println(set.size());
       System.out.println(set.contains(12));
       
       Iterator<Integer> tr = set.iterator();
       while(tr.hasNext()) {
    	   System.out.println(tr.next());
    	   
       }
	}

}
