package HashSet;

import java.util.Objects;
import java.util.TreeSet;


public class ComSet_1 {

	public static void main(String[] args) {
		
		Bike b1 = new Bike(101,"TVS",200000);
		Bike b2 = new Bike(102,"HONDA",300000);
		Bike b3 = new Bike(103,"Ninja",200000);
		Bike b4 = new Bike(101,"TVS",200000);
        Bike b5 = new Bike(104,"BMW",200000);

        TreeSet<Bike> bt = new TreeSet<>();
        
        bt.add(b1);
        bt.add(b2);
        bt.add(b3);
        bt.add(b4);
        bt.add(b5);
		
        System.out.println(bt);
        System.out.println(b1.equals(b4));
        System.out.println(b1.hashCode());
        System.out.println(b4.hashCode());
		
		

	}

}
class Bike implements Comparable<Bike>{
	int id;
	String name;
	double price;
	
	public Bike(int id, String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.price;
		
	}
	public int hashCode() {
		return Objects.hash(id,name,price);
	}
	public boolean equals(Object obj) {
		Bike bb = (Bike) obj;
		
		return this.id==bb.id && this.name.equals(name) && this.price==bb.price;
	}
	
	 public int compareTo(Bike o) {
		 return Integer.compare(this.id,o.id);
	
}
}


