package Distint;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_reverse_3 {

	public static void main(String[] args) {
         List.of("Hello Bhai")
         .stream()
         .map(p->p.split("= "))
         .map(i->new StringBuffer().reverse().toString()).forEach(System.out::println);
     
         
         System.out.println("==============================");
        
        List<String>list=List.of("Hello Bhai");
        list.stream()
        .map(i->new StringBuffer(i).reverse().toString()).forEach(System.out::println);
        
       
	}

}
