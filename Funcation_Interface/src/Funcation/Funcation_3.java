package Funcation;

import java.util.function.Function;

public class Funcation_3 {

	public static void main(String[] args) {
		
        Function<String , Integer> fun=(i)->Integer.parseInt(i);
        System.out.println(fun.apply("12").getClass());
	}

}
