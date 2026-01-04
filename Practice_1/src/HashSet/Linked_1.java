package HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Linked_1 {

	public static void main(String[] args) {
		Enter e = new Enter(101, "A", 78);
		Enter e1 = new Enter(101, "A", 78);
		Enter e2 = new Enter(101, "C", 78);
		Enter e3 = new Enter(101, "s", 78);
		Enter e4 = new Enter(101, "J", 78);
		Enter e5 = new Enter(101, "i", 78);
		Enter e6 = new Enter(101, "o", 78);
		Enter e7 = new Enter(101, "k", 78);

		LinkedHashSet<Enter> str = new LinkedHashSet<>();
		str.add(e);
		str.add(e1);
		str.add(e2);
		str.add(e3);
		str.add(e4);
		str.add(e5);
		str.add(e6);
		str.add(e7);
		
		System.out.println(str);
		System.out.println(e.equals(e1));
		System.out.println(str.equals(str));
		System.out.println(e.hashCode());
		System.out.println(e1.hashcode());
		
		
		System.out.println("========================");
          Iterator<Enter> tr = str.iterator();
          while(tr.hasNext()) {
        	  System.out.println(tr.next());
        	  
          }
	}

}

class Enter {
	int id;
	String name;
	int mark;

	public Enter(int id, String name , int mark) {
		this.id = id;
		this.name  = name;
		this.mark = mark;
	}

	public String toString() {
		return this.id + " " + this.name + " " + this.mark;
	}

	public int hashcode() {
		return Objects.hash(id,name, mark);
	}

	public boolean equals(Object obj) {
		Enter e1 = (Enter) obj;

		return this.id == e1.id && this.name.equals(e1) && this.mark==e1.mark;
	}

}