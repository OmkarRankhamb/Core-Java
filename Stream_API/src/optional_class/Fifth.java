package optional_class;

import java.util.Optional;

public class Fifth {

	public static void main(String[] args) {
        
		Optional<String> ops = Optional.ofNullable(null);
		
		System.out.println(ops.isPresent());
		
		System.out.println(ops.orElse("Hello"));
		ops.ifPresent((i)->{System.out.println(i.toUpperCase());});
		ops.ifPresentOrElse(System.out::println, ()->{System.out.println("nhi bhetali value re!!!! ");});
	}

}
