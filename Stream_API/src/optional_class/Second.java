package optional_class;

import java.util.Optional;

public class Second {

	public static void main(String[] args) {
		  Optional<String> ops = Optional.ofNullable(null)	;	 
		  System.out.println(ops.get());
		  
          // System.out.println(ops.orElse("done"));
          System.out.println(ops.orElseThrow(()->new RuntimeException ("value not prasent")));
		//  System.out.println(ops.isPresent());
           ops.ifPresentOrElse((i)->System.out.println(i),()->System.out.println("done"));
		  
	}

}
