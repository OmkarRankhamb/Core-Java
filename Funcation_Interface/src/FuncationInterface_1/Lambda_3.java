package FuncationInterface_1;

public class Lambda_3 {

	public static void main(String[] args) {
        Demo_1<Integer , String > demo = (t1 , t2)->{
        	return new StringBuffer("hello").append(t1+t2).toString();
        };
        
        String num = demo.add(23,78);
        System.out.println(num);
	}

}
interface Demo_1<T ,R>{
	R add(T t1 ,T t2 );
}
