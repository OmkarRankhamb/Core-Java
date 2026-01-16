package Default;

public class Student {

	public static void main(String[] args) {
          Collage gg = new Collage(1,"ram",2112);
          System.out.println(gg.id);
          System.out.println(gg.id1);
          System.out.println(gg.name);
          System.out.println(gg.name2);
          System.out.println(gg.price);
          
          Loptop_3 pp=new Loptop_3(11,"Raa",413550);
         System.out.println(pp);
          
	}

}

class Student_5 {
	int id;
	String name;

	public Student_5(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
class Collage extends Student_5{
	int id1;
	String name2;
	Double price;
	  public Collage(int id1, String name2,double price) {
		  super(id1, name2);
		  this.id1=id1;
		  this.name2=name2;
		  this.price=price;
	  }
}
class Loptop_3{
	int id;
	int price;
	String name;
	String adders;
	int pincode;
	
	
	public Loptop_3() {
		this(12,3232);
		System.out.println("first cons");
	}
	public Loptop_3(int id,int price) {
		this.id=id;
		this.price=price;
		System.out.println("Second cons");
		
	}
	public Loptop_3(int id,String name,int pincode) {
		this();
		this.id=id;
		this.name=name;
		this.pincode=pincode;
		System.out.println("Third cons");
	}
}