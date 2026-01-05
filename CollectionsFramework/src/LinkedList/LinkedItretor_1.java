package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedItretor_1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("v");
		list.add("D");
		list.add("H");
		list.add(null);
		list.add("P");
		list.add(null);
		list.add("Q");
		list.add("H");
		list.add("H");

		System.out.println(list);
		System.out.println("=============================");

		Iterator<String> tr = list.iterator();
		while (tr.hasNext()) {

			System.out.println(tr.next());
		}

	}

}
