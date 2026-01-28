package optional_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class List_2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(null);
		
		Optional<Integer> op= list
				.stream()
				//.filter(Objects::nonNull)
				.filter(e->e!=null)
				.reduce((i,j)->i+j);
		op.ifPresentOrElse(System.out::println,()->System.out.println("empty List"));

	}

}
