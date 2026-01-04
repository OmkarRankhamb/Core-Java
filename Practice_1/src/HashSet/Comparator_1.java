package HashSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Comparator_1 {
	public static void main(String[] args) {
		Loptop lp = new Loptop(101, "LONOVO", 4);
		Loptop lp1 = new Loptop(102, "Dell", 6);
		Loptop lp2 = new Loptop(103, "SAmS", 8);
		Loptop lp3 = new Loptop(101, "LONOVO", 9);

		TreeSet<Loptop> std = new TreeSet<>(new nameComaparator());

		std.add(lp1);
		std.add(lp);
		std.add(lp3);
		std.add(lp2);
		System.out.println(std);

		Iterator<Loptop> tr = std.iterator();
		while (tr.hasNext()) {
			System.out.println(tr.next());
		}

	}

}

class Loptop implements Comparator<Loptop> {
	int id;
	String name;
	double type;

	public Loptop(int id, String name, double type) {
		this.id = id;
		this.name = name;
		this.type = type;

	}

	public String toStirng() {
		return this.id + "" + this.name + " " + this.type;

	}

	public String toString() {
		return "Loptop [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

	public int compare(Loptop o1, Loptop o2) {
		return Integer.compare(o2.id, o1.id);
	}

}

class idComparator implements Comparator<Loptop> {

	public int compare(Loptop o1, Loptop o2) {

		return Integer.compare(o2.id, o1.id);
	}

}

class nameComaparator implements Comparator<Loptop> {

	public int compare(Loptop o1, Loptop o2) {
		return o1.name.compareTo(o2.name);
	}

}

class typeComparator implements Comparator<Loptop> {

	public int compare(Loptop o1, Loptop o2) {
		return Double.compare(o1.type, o2.type);
	}

}