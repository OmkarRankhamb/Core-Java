package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class map_2 {

	public static void main(String[] args) {
	Map<Integer, List<String> >list= List.of("aaaaa","aaaa","aaaaa","asdc")
	  .stream()
	  .collect(Collectors.groupingBy(String::length));
	
	System.out.println(list);
	
//	for(Map.Entry<Integer, List<String>> m: list.entrySet()) {
//		m.getValue().stream()
//		.sorted((i,j)->return Integer.compare(j, i))
		
	}
         
	}


