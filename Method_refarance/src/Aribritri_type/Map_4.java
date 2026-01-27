package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_4 {

	public static void main(String[] args) {
	Map<Integer,String> map=	List.of("abcd","dfs","cbdh","ueoir")
		.stream()
		.collect(Collectors.toMap(String::length,String::new,(first ,second)->{return second;}));
            System.out.println(map);
	}

}
