package Consumer;

import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {
        P_demo demo = new P_demo();
        
        demo.accept(25);
	}

}

class P_demo implements Consumer<Integer>{

	public void accept(Integer t) {
		 System.out.println(t*3);
	}
	
}
