package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_List_2 {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(23);
		list1.add(87);
		list1.add(45);

		List<Integer> list2 = new ArrayList<>();

		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);

		List<List<Integer>> list3 = new ArrayList<>();

		list3.add(list1);
		list3.add(list2);

		System.out.println(list3);

		First_4 firs = new First_4();
		firs.accept(list3);

	}
}

class First_3 implements Consumer<List<Integer>> {

	public void accept(List<Integer> t) {
		int sum = 0;

		for (int i : t) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}

}

class First_4 implements Consumer<List<List<Integer>>> {

	public void accept(List<List<Integer>> t) {
		for (List<Integer> list : t) {

			First_3 fst = new First_3();
			fst.accept(list);

		}

	}

}