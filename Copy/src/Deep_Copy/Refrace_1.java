package Deep_Copy;

public class Refrace_1 {

	public static void main(String[] args) {
/*
 * Refrence copy              
 */
		Demo d = new Demo();
		d.id = 23;
		d.name = "abc";
        
		Demo  d1=d;
		d1.name="bcd";
		
		System.out.println(d.id);
		System.out.println(d.name);
		
	}

}

class Demo {
	int id;
	String name;
}