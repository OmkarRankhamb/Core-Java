package optional_class;

import java.util.List;
import java.util.Optional;

public class Third {

	public static void main(String[] args) {
		Optional<Integer> op = Optional.ofNullable(23);
		
		System.out.println(op.getClass());
		System.out.println(op.filter((i)->(i>3)).get());
		System.out.println(op.flatMap((i)->(Optional.of(i*2))).get());

	}

}
