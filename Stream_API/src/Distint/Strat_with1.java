package Distint;

import java.util.List;

public class Strat_with1 {

	public static void main(String[] args) {
            List.of(12,43,11,34,16,186,67,45,198)
            .stream().map(i-> new StringBuffer(i).toString().startsWith("1"))
            .forEach(i->System.out.println(i));
            System.out.println("++++++++++==");
	}

}
