package NoArgsConstructor;

public class Third {

	public static void main(String[] args) {
		Pushpa d1 = new Pushpa(123, "om", 1212);
		d1.nir.acceptRecord();

		Pushpa d2 = new Pushpa(789, "jjj", 1212);
		d2.nir.acceptRecord();

	}

}

class Employ {

	String name;
	int id;
	public static int rollno;

	Employ(String name, int id) {
		this.name = name;
		this.id = id;

	}

	static {
		rollno = 3434;
	}

	public void acceptRecord() {
		System.out.println("name:" + name);
		System.out.println("id: " + id);
		System.out.println("rollno: " + rollno);
		System.out.println();
	}
}

class Pushpa {

	int empid;
	Employ nir;

	Pushpa(int empid, String name, int id) {
		this.empid = empid;
		this.nir = new Employ(name, id);
		System.out.println("empid: " + empid);

	}

}
