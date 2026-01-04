package HashSet;

import java.util.TreeSet;

public class Tree_1 {

	public static void main(String[] args) {
            TreeSet<Integer> tr = new TreeSet<>();
            
            tr.add(12);
            tr.add(23);
            tr.add(23);
            tr.add(98);
            tr.add(90);
            tr.add(10);
            
            System.out.println(tr);
            System.out.println(tr.hashCode());
            System.out.println(tr.getFirst());
            System.out.println(tr.getLast());
            System.out.println(tr.size());
            System.out.println(tr.clone());
	}

}
