package StringBuffer;

public class StringBufferreverse {

	public static void main(String[] args) {

		String s = "ABCDEFGH";

		StringBuffer pk = new StringBuffer(s);

		pk.reverse();

		System.out.println(pk);
	}
}