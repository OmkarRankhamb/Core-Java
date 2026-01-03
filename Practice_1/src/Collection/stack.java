package Collection;

import java.util.Iterator;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
       Stack<Integer> tr = new Stack<Integer>();
       tr.push(56);
       tr.push(67);
       tr.push(34);
       tr.push(89);
       tr.push(23);
       tr.push(23);
       
       
       System.out.println(tr.peek());
       System.out.println(tr.pop());
       System.out.println(tr.remove(3));
       System.out.println(tr);
       
       Iterator<Integer> lp = tr.iterator();
       while(lp.hasNext()){
    	   System.out.println(lp.next());
       }
	}

	
}
