package Lambda_1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Map_1 {

	public static void main(String[] args) {
		
    List< String> list=List.of("Car","etyw","etwy","poio");
    
    Function<String ,StringBuffer> fun=(i)->{return new StringBuffer(i).reverse();};
    Consumer<StringBuffer> fun2 =(i)->{System.out.println(i);};
    
    
    list.stream().map(fun).forEach(fun2);
    
	}

}
