package Aribritri_type;

import java.util.List;

public class First {
	
  public static void main(String [] args) {
	  List.of(121212,213,324,45,567)
	  .stream()
	  .map(Demo::add)
	 // .map(Math::sqrt)
	  .forEach(System.out::println);
  }
}
class Demo{
	public static int add (int i) {
		return i*i;
	}
}
