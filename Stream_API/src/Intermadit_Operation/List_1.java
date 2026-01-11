package Intermadit_Operation;

import java.util.List;

public class List_1 {

	public static void main(String[] args) {
          List<Integer> list = List.of(12,23,13,24,15,34,17);
          
          
          for( Integer n: list) {
        	  if(String.valueOf(n).startsWith("1")){
        		  System.out.println(n);
        		  
        	  }
        	  
          }
	}

}
