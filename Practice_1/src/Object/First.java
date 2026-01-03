package Object;

import java.util.Objects;

public class First {

	public static void main(String[] args) {
		Bike b1 = new Bike(101, "Ram", "Pune");
        Bike b2=new Bike (101,"Ram","Pune");
        
        
        System.out.println(b1.equals(b2));
        System.out.println(b2.hashCode());
	}

}

class Bike {
	int id;
	String name;
	String city;

	public Bike(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String ToString() {
		return this.id + " " + this.name + " " + this.city;
	}

	public int hashCode() {
		return  id;
	}

	public boolean equals(Object obj) {

		Bike other = (Bike) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}
}