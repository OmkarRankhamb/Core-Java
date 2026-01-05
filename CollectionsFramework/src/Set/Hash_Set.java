package Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        
        set.add(188);
        set.add(12);
        set.add(null);
        set.add(null);
        set.add(12);
        set.add(67);
        set.add(34);
        
        
        System.out.println(set);
        System.out.println(set.remove(12));
        System.out.println(set.size());
        set.size();
        System.out.println(set.contains(34));
        System.out.println(set.equals(set));
        System.out.println(set);
	}

}
