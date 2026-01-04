package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map_1 {

	public static void main(String[] args) {
       HashMap<Integer, Integer> lp  = new HashMap<>();
       
       lp.put(67, null);
       lp.put(2, null);
       lp.put(1, null);
       lp.put(null, 4);
       lp.put(8, null);
       lp.put(23, 213);
       lp.put(94, null);
       lp.put(23, 51);
       lp.put(67, 4);
       
       System.out.println(lp);
       System.out.println("=================================");
       for(Entry<Integer , Integer> pp :lp.entrySet()) {
    	   System.out.println(pp.getKey()+"="+pp.getValue());
    	   
       }
       
       
       
       
       
       
       
	}

}
