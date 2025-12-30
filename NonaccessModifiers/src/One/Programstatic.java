package One;


public class Programstatic {
	public static void main(String [] args) {
		Student s1 = new Student("Sham ",121);
	      s1.printDislay();
	      
	      Student s2 = new Student("om ",122);
	    s2.printDislay();
}
}
	class Student{
		
	
	static String schoolName;

	String name;
	int Id;
	static double fees;

	public Student(String name, int Id) {
		this.name = name;
		this.Id = Id;
	//	this.fees = fees;

	}
	
	public void printDislay() {
		System.out.println(schoolName = "Cocsit");
		System.out.println("name:" + name);
		System.out.println("Id:" + Id);
		System.out.println(fees=60000);

		System.out.println("===================");
	}
	}

	
	