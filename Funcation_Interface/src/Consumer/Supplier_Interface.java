package Consumer;

import java.util.function.Supplier;

public class Supplier_Interface {
   public static void main(String []args ) {
	   Supplier<Double> opp = ()->{return Math.random()*1000;};
	   
	   System.out.println(opp.get().intValue());
	   
   }
}
