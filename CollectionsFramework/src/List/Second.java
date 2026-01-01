package List;

import java.util.ArrayList;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		
		Ianimal<Integer, String > ian=new Tiger<Integer>();
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		 System.out.println(ian.weight("1000")+56);
		
	}
}



interface  Ianimal<R,T> 
{
	R weight(T t);
	
}
class Car
{
	int id;
	String name;
}
class Tiger<T> implements Ianimal <Integer, String>
{


	public Integer weight(String t) {
		return Integer.parseInt(t);
	}
	
	
}
	


