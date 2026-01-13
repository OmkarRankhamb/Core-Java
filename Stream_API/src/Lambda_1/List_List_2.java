package Lambda_1;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class List_List_2 {

	public static void main(String[] args) {
          List<List<String>> list =List.of(
        		  List.of("Good ","Morning"),
        		  List.of("Happy","journey"),
        		  List.of("The","End!"));
          
          List<String> name =list.stream().flatMap(Collection :: stream).collect(Collectors.toList());
          
          System.out.println(name);
	}

}
