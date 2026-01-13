package Lambda_1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class List_List {

	public static void main(String[] args) {
         
		List<List<String> >name =List.of(
				List.of("Amer","Bhise"),
				List.of("Soma","Patil"),
				List.of("Abhi","Rankhamb"));
				
		List<String> names =name.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		System.out.println(name);
	}

}
