package uss;
class Employee{
	private String name;
	private int id;
	private float salary;
	
	
	public Employee(String name,int id,float salary) {
		this.name=name;
		this.id= id;
		this.salary= salary;
		
	}
	
	
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	public void printRecord() {
		System.out.println("name="+name);
		System.out.println("id= "+id);
		System.out.println("salsry="+salary);
	}
}

public class Program {
    public static void main(String []args) {
    	Employee emp = new Employee("om",12,23.3f);
    	String str = emp.toString();
    	System.out.println(str);
    }

	}


