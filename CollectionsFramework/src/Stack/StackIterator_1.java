package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackIterator_1 {

	public static void main(String[] args) {
		Stack<Integer> trac = new Stack<>();

		trac.add(23);
		trac.add(87);
		// trac.add(null);   // The use of Iterator not allowed null valuve
		trac.add(12);
		// trac.add(null);
		trac.add(98);

		System.out.println(trac);

		Iterator<Integer> tr = trac.iterator();
		while (tr.hasNext()) {
			int x = tr.next();
			if (x == 87) {
				tr.remove();
				System.out.println(trac);

			}
		}

	}

}
