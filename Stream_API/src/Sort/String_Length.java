package Sort;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class String_Length {

	public static void main(String[] args) {
      List<String> list=List.of("om","Amer","Venkya");
      
       list.stream().map(i-> i.toUpperCase()).map((i)-> new StringBuffer(i)).map(i->i.reverse())
      .map((i)->{return i.length();}).filter(i->i>3).skip(2).limit(1)
    		  .sorted((i,j)-> Integer.compare(i, j))
    		  .forEach(System.out::println);
      
      
	}

}
