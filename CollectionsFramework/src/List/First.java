package List;

import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(3);
        array.add(null);
        array.add(null);
        System.out.println(array);
        System.out.println(array.remove(2));
        System.out.println(array.clone());
        System.out.println(array.equals(2));
        System.out.println(array.hashCode());
	}

}
