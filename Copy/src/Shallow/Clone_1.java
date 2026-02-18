package Shallow;

public class Clone_1 {
	/*
	 * Deep copy
	 */

	public static void main(String[] args) throws Exception {
         Bike bike = new Bike("Shine ",150);
         bike.cc=120;
         
         System.out.println(bike.name);
         System.out.println(bike.cc);
         
         System.out.println("_______________________________");
         Bike b1 = (Bike)bike.clone();
      
         
         System.out.println(b1.cc);
         System.out.println(b1.name);
         System.out.println(b1.equals(bike));
	}

}
class Bike implements Cloneable{
	String name;
	int cc;
	
	public Bike(String name, int cc) throws Exception {
		if(cc<125) {
		throw new Exception ("not real bike ...");
		}
		this.name=name;
		this.cc=cc;
		System.out.println("Object create.............!");
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
