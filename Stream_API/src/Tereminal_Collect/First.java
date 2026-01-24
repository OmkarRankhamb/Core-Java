package Tereminal_Collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class First {

	public static void main(String[] args) {
		
	List<Integer> list=	List.of(1,2,3,4,5,6,7,3,34,54,67,879,45,3423,3,522);
	List<Integer> sum=list.stream()
	.collect(new Storing());
	System.out.println(sum);
		

	}

}

class Storing implements Collector<Integer, List<Integer>, List<Integer>> {

	@Override
	public Supplier<List<Integer>> supplier() {
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		return (list, integer)->{
			if(integer>30&& integer %2!=0) {
				list.add(integer);
			}
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		return(list1,list2)->{
			list1.addAll(list2);
			return list1;
		};
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		return (list)->(list);
			}

	@Override
	public Set<Characteristics> characteristics() {
		return new HashSet<Collector.Characteristics>();
	}
}
