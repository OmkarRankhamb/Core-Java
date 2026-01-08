package Consumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_List_4 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(34);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		list1.add(55);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(11);
		list3.add(12);
		list3.add(13);
		list3.add(14);

		List<List<List<Integer>>> list4 = new ArrayList<>();
		
		
		
		

		System.out.println(list4);

	}

}

class demo_K implements Consumer<List<Integer>> {

	public void accept(List<Integer> t) {
		int sum = 0;
		for (int i : t) {
			sum += 0;
		}
		System.out.println(sum);
	}
}

class demo_l implements Consumer<List<List<List<Integer>>>> {

	public void accept(List<List<List<Integer>>> t) {
		for (List<List<Integer>> list1 : t) {
			
		
			for(List<List<Integer>> list2 : t){
				
			}
		{

			ArrayList list4 = new ArrayList();
		
               System.out.println(list4);
		}
	}
	}
}
