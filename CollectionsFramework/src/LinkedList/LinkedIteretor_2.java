package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedIteretor_2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		list.add(12);
		list.add(23);
		list.add(43);
		list.add(98);
		list.add(98);
		list.add(45);
		System.out.println(list);
		
		System.out.println("The use of iterator remove the element");
		
		Iterator<Integer> tr = list.iterator();
		while (tr.hasNext()) {
			int x = tr.next();
			if (x == 12) {
				tr.remove();
				System.out.println(list);
			}

		}

	}

}
