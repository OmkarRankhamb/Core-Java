package Intermadit_Operation;

import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          
          list.add(12);
          list.add(23);
          list.add(34);
          list.add(56);
          
          System.out.println(list);
          
          list.stream().forEach(i->System.out.println(i*30));
          System.out.println("+++++++++++++++++++++++");
          
          list.stream().filter((i->i>20)).forEach(i->System.out.println(i*2));
	}

}
