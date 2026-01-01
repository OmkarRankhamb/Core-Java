package List;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> Str = new ArrayList<Integer>();

		Str.add(23);
		Str.add(45);
		Str.add(12);
		Str.add(23);

		System.out.println(Str.equals(Str));
		System.out.println(Str.hashCode());
		System.out.println(Str.equals("23"));
	}

}
