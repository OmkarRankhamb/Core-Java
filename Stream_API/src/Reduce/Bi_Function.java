package Reduce;

import java.util.function.BiFunction;

public class Bi_Function {

	public static void main(String[] args) {
		BiFunction<String , String[],Integer> Bi =(t,u)->t.length()+t.length();
		System.out.println(Bi.apply("1121",new String[] {"hasd","ada"}));
		

	}

}
