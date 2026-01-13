package Lambda_1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class String_Length_1 {

	public static void main(String[] args) {
      List<String> list = List.of("Pune","Mumbai","Latur","Dharasiv","Dubai","pp");
      
      Map<String,Integer> map= list.stream().collect(Collectors.toMap(s->s,String::length));
      System.out.println(map);
      
      
	}

}
