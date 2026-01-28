package optional_class;

import java.util.Optional;

public class Fourth {

	public static void main(String[] args) {
		
		Optional<Integer> ops = Optional.ofNullable(20);
		
		System.out.println(ops.filter((i)->(i>10))
		.orElseThrow(()->new RuntimeException("Value is not prasent")));

	}

}
