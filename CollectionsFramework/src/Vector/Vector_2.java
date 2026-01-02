package Vector;

import java.util.Vector;

public class Vector_2 {
  public static void main (String [] args ) {
	  Vector<String> vec=new Vector<String>();
		
		
		vec.add("2");
		vec.add("1");
		
		System.out.println(vec);
		
		String status= vec.remove(1);
		// System.out.println("removed element:"+i);
		System.out.println(status);
		System.out.println(vec);
  }
}
