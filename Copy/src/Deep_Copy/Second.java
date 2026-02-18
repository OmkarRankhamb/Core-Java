package Deep_Copy;
/*
 * Deep copy
 */
public class Second {

	public static void main(String[] args) throws CloneNotSupportedException {
       Emp e = new Emp();
       e.i=45;
       System.out.println(e.i);
       
       
       Emp p =(Emp)e.clone();
       p.i=46;
       System.out.println(p.i);
	}

}
class Emp implements Cloneable{
	int i;
	
	public Emp() {
		System.out.println("Object Create.........");
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
