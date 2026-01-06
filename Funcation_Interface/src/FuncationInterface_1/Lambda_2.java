package FuncationInterface_1;

public class Lambda_2 {

	public static void main(String[] args) {
            A_add<Integer> std = (t1 ,t2)-> (t1+t2);{
            	//return t1+t2;
            };
          int sum=  std.add(10, 67);
          System.out.println(sum);
	}
	
}
interface A_add<T>{
	int  add( T t1 , T t2);
}