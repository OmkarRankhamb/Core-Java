package FuncationInterface_1;

public class Using_Lambda {

	public static void main(String[] args) {
       Loptop<Integer> lop = (t1,t2)->{
    	   System.out.println(t1+t2);
       };
       lop.add(100, 121);
	}

}
interface Loptop<T>{
	void add(T t1 , T t2);
}