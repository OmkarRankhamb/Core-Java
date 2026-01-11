package Funcation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {
		Function<Double, String> fun = (i) -> {
			return String.valueOf(i);
		};
		System.out.println(fun.apply(112.0));

		Function<String, Integer> fun1 = (i) -> {
			return i.length();
		};
		System.out.println(fun1.apply("omkar"));

		Function<Double, Integer> fun3 = fun1.compose(fun);

		System.out.println(fun3.apply(123456.7));

	}

}
