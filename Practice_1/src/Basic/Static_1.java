package Basic;

public class Static_1 {

	public static void main(String[] args) {
		Demo d1 = new Demo(101, "OM");

		
		d1.printre();
		d1.print();
	}

}

class Demo {
	int id;
	String name;

	public Demo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void print() {
		System.out.println("I am working proparali...........");
	}
	
	static
	{
		int id = 202;
		System.out.println("I am not working........"+id);
	}

	public void printre() {
		System.out.println("Id " + id);
	}
}
