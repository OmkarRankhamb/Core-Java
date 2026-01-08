package Consumer;

import java.util.function.Consumer;

public class Consumer_2 {
public static void main(String []args ) {
	
  Consumer <Integer> demo =(t)->{System.out.println(t);};
  
  demo.accept(25);
}
}
