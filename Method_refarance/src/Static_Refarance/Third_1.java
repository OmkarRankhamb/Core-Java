package Static_Refarance;

import java.util.List;

public class Third_1 {

	public static void main(String[] args) {
		List<Integer> list= List.of(12,34,45,45,132,45,65512);
		int multi=list .stream()
				
		 .filter(Demo_4::add)
		 .peek(System.out::println)
		 .reduce(1,(i,j)->i*j);
		System.out.println(multi);
		 

	}

}
class Demo_4{
	public static boolean add(int  i) {
		return i>2;
	}
}
