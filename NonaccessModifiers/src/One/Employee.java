package One;

public class Employee {
	static String companyname;
	int Id;
	String name;
	double salary;
	
	public Employee(int Id,String name) {
		this.Id=Id;
		this.name=name;
		this.salary=salary;
	}
	void diplay() {
		
	    System.out.println( companyname="TCS");

		System.out.println("Id    :   "+Id);
		System.out.println("name   :   "+name);
    
		calculatesalary();
		
		System.out.println("===================");
	}
	static void calculatesalary() {
		
	double dailysalary=6000;
	double monthlysalary=dailysalary*30;
	System.out.println("salary:   "+monthlysalary);
	
	}
	


	public static void main(String[] args) {

		Employee e1 = new Employee(1, "om");
		e1.diplay();

		Employee e2 = new Employee(2, "Ram");
		e2.diplay();

		Employee e3 = new Employee(3, "Sham");
		e3.diplay();
	}

}
