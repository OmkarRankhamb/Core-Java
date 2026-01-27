package Aribritri_type;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_1 {

	public static void main(String[] args) {
    Map<Integer, String> nm=Arrays.asList("qwqw","qwqwe","qweqe")
    .stream()
    .collect(Collectors.toMap(String::length, String::new,(first ,second)->{return second;}));
   
    
    System.out.println(nm);
	}

}
