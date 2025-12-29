package Demo;

public class StringBuilderres {

	public static void main(String[] args) {

		String s = "Geeks";

		StringBuilder res = new StringBuilder();

		res.append(s);

		// reverse StringBuilder res
		res.reverse();

		System.out.println(res);
	}
}
