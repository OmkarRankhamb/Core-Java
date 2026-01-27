package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_3 {

	public static void main(String[] args) {
       Map<Integer, List<String>> mp = List.of("afdfd","s","sfg","d","pgfgff")
    		   .stream()
    		   .collect(Collectors.groupingBy(String::length));
     //  mp.entrySet().forEach(System.out::println);
       
       System.out.println(mp);
       for(Map.Entry<Integer,List<String>> entry : mp.entrySet()) {
    	   System.out.println("length: "+ entry.getKey()+" "+entry.getValue());
    	   
       }
      
    	   
       }
	}


