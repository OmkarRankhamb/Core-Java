package optional_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class List_3 {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		
		list.add("abc");
		list.add("bcd");
		list.add(null);
		
		Optional<List<String>> op = Optional.ofNullable(list);
				//System.out.println(op);
		list.stream()
		//.filter(i->i!=null)
		.filter(Objects::nonNull)
		.map(i->i.concat(i).toUpperCase()).forEach(System.out::println);
		
	}

}
