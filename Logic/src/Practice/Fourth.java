package Practice;

import java.util.List;
import java.util.Optional;

public class Fourth {

	public static void main(String[] args) {
		List<Integer> list=	List.of(23,45,66,78,87);
	    Optional<Integer> max= list.stream().reduce((i,j)->Integer.max(i, j));
			System.out.println(max.get());
			
	}

}
