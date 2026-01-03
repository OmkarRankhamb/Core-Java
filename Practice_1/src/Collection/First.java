package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class First {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(67);
		list.add(87);
		list.add(78);
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

		
		Iterator<Integer> it =list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=======================");
		for(int i :list) {
			System.out.println(i);
		}
	}

}
