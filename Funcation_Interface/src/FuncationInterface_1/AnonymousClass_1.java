package FuncationInterface_1;

public class AnonymousClass_1 {

	public static void main(String[] args) {
               Demo<Integer> demo = new Concreant();     // AnonymousClass
               
               demo.add(12, 12);
	}

}
interface Demo<T>{
	void add(T t1 , T t2);
}

class Concreant implements Demo<Integer>{

	public void add(Integer t1, Integer t2) {
		System.out.println(t1+t2);
	}
	
}