package Parameterized;

public class Second {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.printRecord();
	}
}

class Employee {
	int id;
	double Salary;
	String Emp_name;
	String Com_name;

	Employee() {
		id = 412;
		Salary = 60000.0;
		Emp_name = "SHivaji patil";
		Com_name = "PUMA";

	}

	public void printRecord() {
		System.out.println("+ Employee Information +");
		System.out.println(" Com_name==" + Com_name);
		System.out.println("Emp_name==" + Emp_name);

		System.out.println("id==" + id);
		System.out.println("Salary ==" + Salary);
	}

}
