package Uss;

public class Program {

	public static void sum(int... arguments) {
		int add = 0;

		for (int element : arguments)

			add = add + element;
		System.out.println("result" +" "+ add);

	}

	public static void main(String[] args) {
		sum(12,23,24,567);
         sum(657,758,6747,78);
         sum(2424,24242,2424);
	}

}
