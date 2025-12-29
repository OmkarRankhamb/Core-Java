package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collectionsreverse {

	public static void main(String[] args) {

		String s = "MUMBAI";

		char[] arr = s.toCharArray();

		List<Character> l = new ArrayList<>();

		for (char c : arr)
			l.add(c);

		Collections.reverse(l);

		ListIterator it = l.listIterator();

		while (it.hasNext())
			System.out.print(it.next());
	}
}