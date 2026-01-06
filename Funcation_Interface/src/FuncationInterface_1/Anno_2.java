package FuncationInterface_1;

public class Anno_2 {

	public static void main(String[] args) {
		Student<Integer> st = new Student<Integer>() {
			public void add(Integer t1, Integer t2) {
				System.out.println(t1 + t2);

			}
		};
		st.add(12, 34);

	}

}

interface Student<T> {
	void add(T t1, T t2);
}