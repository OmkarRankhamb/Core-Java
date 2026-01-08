package Consumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class List_Consumer {

	public static void main(String[] args) {
         List<Integer> list1 =new ArrayList<>();
         
         list1.add(10);
         list1.add(20);
         
  List<Integer> list2 =new ArrayList<>();
         
         list2.add(11);
         list2.add(22);
         
         List<List<Integer>> list3 = new ArrayList<>();
         list3.add(list1);
         list3.add(list2);
         
        		 System.out.println(list3);
        		 Two_list two = new Two_list();
        		 
        		 two.accept(list3);
	}

}
class First_List implements Consumer<List<Integer>>{

	
	public void accept(List<Integer> t) {
		int sum =0;
		for(int i:t) 
		{
			sum+=i;
		}
		System.out.println(sum);
	}

	
	}
	class Two_list implements Consumer<List<List<Integer>>>{

		public void accept(List<List<Integer>> t) {
			for(List<Integer> list:t) {
				
				First_List list2 = new First_List();
				list2.accept(list);
				
			}
			
		}
		
		
	}
