package Intermadit_Operation;

import java.util.List;
import java.util.function.Predicate;

public class Predicate_Stream {

	public static void main(String[] args) {
        
		   List<Integer> list=List.of(12,34,32,15,5,44,45);
		Predicate<Integer> pre =(i)->{ return i>10; };
		
		   
		  // list.stream().map(i->i*2).forEach(System.out :: println);
		list.stream().filter(pre).forEach(System.out :: println);
			
	}

}
