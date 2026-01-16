package Sort;

import java.util.List;

public class First {

	public static void main(String[] args) {
     List<Integer> list= List.of(1,2,5,3,4,6,7,8);
     
     list.stream().filter((i->i>3))
     
    // .sorted((i,j)->{return Integer .compare(j, i);})
     .peek((i)->System.out.println(i+"A"))
     .forEach(System.out::println);
       
       
       
       
       
       
       
	}

}
