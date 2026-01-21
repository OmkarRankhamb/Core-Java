package Aribritri_type;

import java.util.List;

public class Third {
     public static void main(String[]args) {
    	 
    	 String s = "Hello";
    	 List.of("abc","bcd")
    	 .stream()
    	 .map((q)-> q.concat("hiii"))
    	 .map(i->i+"hey")
    	 .map(s::concat)
    	 .forEach(System.out::println);
     }
}
