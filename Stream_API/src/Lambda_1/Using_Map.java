package Lambda_1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Using_Map {

	public static void main(String[] args) {
   
		List<String> list=List.of("Amer","Shivam","Shivanii..","Samir");
		
		Function<String , Integer> fun =(i)->{return i.length();};
		  Consumer<Integer> str =(i)->{System.out.println(i);};
		
		list.stream().map(fun).forEach(str);
	}

}
