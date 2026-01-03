package Stack;

import java.util.Stack;

public class First {

	public static void main(String[] args) {
           Stack<Integer> stc = new Stack<Integer>();
           
           
           stc.push(12);
           stc.push(56);
           stc.push(67);
           stc.push(12);
           stc.push(87);
           
           
           System.out.println(stc);
           System.out.println(stc.peek());
           System.out.println(stc.pop());
           System.out.println(stc);
	}

}
