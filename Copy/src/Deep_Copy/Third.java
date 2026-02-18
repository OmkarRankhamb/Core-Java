package Deep_Copy;

public class Third {

	public static void main(String[] args) throws Exception {
          Bike_B bike  = new Bike_B("BMW",150);
          
          bike.cc=120;
          
          System.out.println(bike.name+" "+bike.cc);
          
          System.out.println("---------------");
          Bike_B b1 = (Bike_B)bike.clone();
  
          System.out.println(b1.name+" "+b1.cc);
          
          
	}

}
class Bike_B implements Cloneable{
	String name ;
	int cc;
	
	public Bike_B(String name , int cc) throws Exception {
		if(cc<125) {
			throw new Exception("Not real bike......");
		}
		this.cc=cc;
		this.name=name;
		System.out.println("Object Created..........!");
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
