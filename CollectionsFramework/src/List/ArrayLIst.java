package List;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayLIst {

	public static void main(String[] args) {
		ArrayList<Integer> S = new ArrayList<Integer>();

		S.add(10);
		S.add(23);
		S.add(34);
		S.add(89);
		S.add(12);
		S.add(44);
		S.add(11);

		System.out.println("=========Even==============");
		for (int num : S) {

			if (num % 2 == 0) {

				System.out.println("#Even==" + num);

			}
//		System.out.println(S.pop()); // Remove the element 
//		System.out.println(S.peek()); //Return the element & show 
//		System.out.println(S.push(99)); // Add the element on the top Stack
//		System.out.println(S);
		}

		System.out.println("============ODD==============");
		for (int num : S) {
			if (num % 2 != 0) {
				System.out.println("odd===" + num);
			}
		}

	}
}
