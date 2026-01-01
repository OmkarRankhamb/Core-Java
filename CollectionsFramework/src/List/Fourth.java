package List;

public class Fourth {

	public static void main(String[] args) {
		Irun<String> run = new Irunimpl();

		Irun<Integer> run2 = new Irun2();

		System.out.println(run.display("Hello"));
		run2.display(34);

	}

}

interface Irun<T> {

	String display(T t);
}

class Irunimpl implements Irun<String> {

	public String display(String str2) {

		return ("This is the display method with the implementtation..." + str2);

	}

}

class Irun2 implements Irun<Integer> {

	public String display(Integer t) {

		return t.toString();
	}
}
