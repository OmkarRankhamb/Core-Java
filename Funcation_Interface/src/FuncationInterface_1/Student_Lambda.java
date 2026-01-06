package FuncationInterface_1;

public class Student_Lambda {

	public static void main(String[] args) {
		I_add<Integer , String > it =(t1,t2,t3)->{
			return new StringBuffer(" hello ").append(t1+t2+t3).toString();
			
		};
		String sum = it.add(12,34, 23);
		System.out.println(sum);

	}

}
interface I_add<T , R>{
	R add(T t1 , T t2,T t3);
}