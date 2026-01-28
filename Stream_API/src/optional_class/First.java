package optional_class;

import java.util.List;
import java.util.Optional;

public class First {

	public static void main(String[] args) {
     
		Optional<String> pos = Optional.empty();
		
		/*
		 * pos=> 
		 */
		System.out.println(pos.isPresent());
		/*
		 * .get=> Throws the exepation NoSuchElementExcepiton
		 */
	//	System.out.println(pos.get()); 
		
	}

}
