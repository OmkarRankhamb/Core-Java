package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StactIterator_2 {

	public static void main(String[] args) {
		Stack<Integer> trac = new Stack<>();

		trac.add(23);
		trac.add(87);
		trac.add(null);
		trac.add(12);
		trac.add(null);
		trac.add(98);

		System.out.println(trac);
		
		System.out.println("================================");
		
		Iterator<Integer> It = trac.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}

	}

}
