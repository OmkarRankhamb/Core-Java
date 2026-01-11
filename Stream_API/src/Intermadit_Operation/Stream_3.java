package Intermadit_Operation;

import java.util.ArrayList;
import java.util.List;

public class Stream_3 {

	public static void main(String[] args) {
         List<Integer> list =  List.of(12,23,45,12,132,45,124);
          
          
          list.stream().map(String::valueOf).filter(s->s.startsWith("1")).forEach(System.out::println);
	}

}
