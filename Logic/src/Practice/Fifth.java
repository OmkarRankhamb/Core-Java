package Practice;

import java.util.List;

public class Fifth {

	public static void main(String[] args) {
       String A = "main System";
       
       List.of(A).stream().map((i)-> new StringBuffer(i).reverse().toString())
       .forEach(System.out::println);
       
       
	}

}
