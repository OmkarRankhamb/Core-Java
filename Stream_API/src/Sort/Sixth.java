package Sort;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sixth {

	public static void main(String[] args) {
          List<String> list=List.of("abcd","hssh","sgsgsg");
          
         Map<String,Integer> map=list.stream().collect(Collectors.toMap(s->s, String::length));
         System.out.println(map);
	}

}
