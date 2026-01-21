package Static_Refarance;

import java.util.List;

public class First_1 {

	public static void main(String[] args) {
		
		 
   int sum=  List.of(34,56,87,67)
         .stream()
          .filter(Demo::get)
          .reduce(0,Demo::takare);
         // .forEach(Demo::add);
     System.out.println(sum);
	}

}
class Demo{
	
	
	
	public static boolean get(int i) {
		return i>50;
	}
	public static void add(int i) {
		System.out.println(i);
	
}
	public static int takare(int i , int j) {
		return i+j;
	}
}
