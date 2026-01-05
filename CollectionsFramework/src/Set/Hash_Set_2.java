package Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hash_Set_2 {

	public static void main(String[] args) {
		Car c = new Car(1900,3446556);
		Car c1 = new Car(1900,3446556);
		
       Set<Car> set = new HashSet<>();
       
       set.add(c);
       set.add(c1);
       
       System.out.println(set);
       System.out.println(c.equals(c1));
       System.out.println("=======================");
       System.out.println(c1.equles(c));
       System.out.println(c.hashcode());
       System.out.println(c1.hashcode());
	}

}
class Car{
	int model;
	int Price;
	
	public Car(int model,int price) {
		this.model=model;
		this.Price=price;
		
	}
	public String toString() {
		return this.model+" "+this.Price;
	}
	public int hashcode() {
		return Objects.hash(model,Price);
	}
	public boolean equles(Object Obj) {
		Car c1 = (Car) Obj;
		return this.model==c1.model && this.Price==c1.Price;
	}
}
