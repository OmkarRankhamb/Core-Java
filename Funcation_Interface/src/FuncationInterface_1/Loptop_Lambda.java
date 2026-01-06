package FuncationInterface_1;

public class Loptop_Lambda {

	public static void main(String[] args) {
		Car<Integer,String,Character> inc = (t1,r1,a1)->{
			
			return new StringBuffer("hello").append(t1).append("A").toString();
			
		};
		String num= inc.add( 12 , "TOP", 'P');
		System.out.println(num);

	}

}
interface Car<T,R,A>{
	R add(T t1,R r1,A a1);
}
