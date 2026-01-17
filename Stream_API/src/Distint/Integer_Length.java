package Distint;

import java.util.List;

public class Integer_Length {

	public static void main(String[] args) {
         List.of(123,322,3232)
//         .stream()
//         .map(String ::valueOf).map(String::length).forEach(System.out::println);
      //   .stream().map((i)->i.toString(3).valueOf(3)).map(i->i.length()).forEach(System.out::println);
         .stream()
         .map(i->String.valueOf(i)).map(i->i.length()).forEach(System.out::println);
	}

}
