package Funcation_Interface;

public class Interface_1 {
	public static void main(String[] args) {
		Demo<Integer> demo = new Concreat();

		demo.add(101, 322);

	}
}

interface Demo<T> {
	void add(T t1, T t2);

}

class Concreat implements Demo<Integer> {

	public void add(Integer t1, Integer t2) {
		System.out.println(t1 + t2);
	}

}
