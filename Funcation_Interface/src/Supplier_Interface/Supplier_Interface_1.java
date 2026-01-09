package Supplier_Interface;

import java.util.function.Supplier;

public class Supplier_Interface_1 {

	public static void main(String[] args) {
    
		Supplier<Double> opt = ()->{return Math.random()*5000;};
		
		
		System.out.println(opt.get().intValue());
		
	}

}
