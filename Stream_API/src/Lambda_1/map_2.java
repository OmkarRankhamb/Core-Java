package Lambda_1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class map_2 {

	public static void main(String[] args) {
		
		/*
		 * String Convert toUpperCase
		 */
		
      List<String> list=List.of("Pune","Mumbai","Latur","Dharasiv");
      
      
      Function<String,String> str2 =(i)->{return i.toUpperCase();};
      Function<String,StringBuffer > str =(i)->{return new StringBuffer(i);};
      Consumer<StringBuffer> con =(i)->{System.out.println(i);};
      
      list.stream().map(str2).map(str).forEach(con);
	}

}
