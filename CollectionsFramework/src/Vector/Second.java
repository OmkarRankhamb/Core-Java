package Vector;

import java.util.Vector;

public class Second {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		
		
		
		vec.add(45);
		vec.add(67);
		vec.add(89);
		vec.add(89);
		vec.add(null);
		vec.add(54);
		vec.add(null);
		
		System.out.println(vec);
		System.out.println(vec.lastIndexOf(3));
		System.out.println(vec.getLast());
		System.out.println(vec.getFirst());
		System.out.println(vec.remove(4));
		System.out.println(vec);
		
	}

}
