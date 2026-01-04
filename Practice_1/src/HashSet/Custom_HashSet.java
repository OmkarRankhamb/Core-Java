package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Custom_HashSet {

	public static void main(String[] args) {
		Pen pen = new Pen(101, "Pinpoint", 10);
		Pen pen1 = new Pen(103, "Pinpoint", 10);
		Pen pen2 = new Pen(101, "Pinpoint", 10);
		Pen pen3 = new Pen(102, "Pinpoint", 10);
		Pen pen4 = new Pen(104, "Pinpoint", 10);
		Pen pen5 = new Pen(105, "Pinpoint", 10);


		HashSet<Pen> set = new HashSet<Pen>();

		System.out.println(pen);
		System.out.println(pen1.equals(pen));
		System.out.println(pen.hashCode());
		System.out.println(pen1.hashCode());
		
		set.add(pen5);
		set.add(pen);
		set.add(pen1);
		set.add(pen3);
		set.add(pen4);
		
		System.out.println(set.equals(set));
		
	    Iterator<Pen> it = set.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		

}
}

class Pen {
	int number;
	String name;
	double Price;

	public Pen(int number, String name, double price) {
		this.number = number;
		this.name = name;
		this.Price = price;
	}

	public String toString() {
		return this.number + " " + this.name + " " + this.Price;
	}

	public int hashCode() {
		return Objects.hash(number,name,Price);
	}

	public boolean equals(Object obj) {

		Pen p1 = (Pen) obj;
		return this.number==p1.number && this.name.equals(p1.name) && this.Price == p1.Price;
	}

}