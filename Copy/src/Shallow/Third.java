package Shallow;

public class Third {

	public static void main(String[] args) throws CloneNotSupportedException {

		Lop pop = new Lop("Brand::");
		//pop.Lop_name = "Sjdk";
		
		Loptop loptop = new Loptop();

		loptop.name = "Dell";
		loptop.price = 45.0;

		loptop.top = pop;

		Loptop lp = (Loptop) loptop.clone();
		lp.name = "Sam";
		System.out.println("name::"+loptop.name+" price::"+loptop.price+" "+pop.Lop_name);
		System.out.println("name::"+lp.name+" "+" price::"+lp.price+" "+pop.Lop_name );
	}

}

class Loptop implements Cloneable {
	String name;
	double price;
	Lop top;

	public Object clone() throws CloneNotSupportedException {
		Loptop lp = (Loptop) super.clone();
		lp.top = new Lop(this.top.Lop_name);
		return lp;

	}
}

class Lop {
	String Lop_name;

	public Lop(String Lop_name) {
		this.Lop_name = Lop_name;
	}
}