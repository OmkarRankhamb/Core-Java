package uss;
class Student{
	private String name;
	private int id;
	private float salary;
	
	public Student(String name , int id, float salary) {
		this.name= name ;
		this .id = id;
		this .salary = salary ;
		
		
	}

public class uss {

	public static void main(String[] args) {
		Student  emp = new Student ("om",123,123.2f);
		Student  emp1 = new Student("om",123,123.2f);
		
		if(emp == emp1)
		System.out.println("equle");
	
		else
			System.out.println("NOt equle");
			
	}
	

	}

}
