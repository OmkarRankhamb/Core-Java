package Lambda_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Average_3 {

	public static void main(String[] args) {
		
		List<Person>list=Arrays.asList(
		
		        new Person(1,"Sam","IT",340000),
		         new Person(1,"Sam","IT",340000),
	             new Person(1,"Sam","IT",340000),
	             new Person(1,"Sam","IT",340000),
		        new Person(1,"Sam","IT",340000));

		
		 
		 
          Map<String,Double> Average = list.stream()
		   .collect(Collectors.groupingBy(Person::getDepartment,
				   Collectors.averagingDouble(Person::getSalary)
				   
				   ));
          System.out.println(Average);
          

	}

}

class Person {
	int id;
	String name;
	String Department;
	double Salary;

	public Person(int id, String name, String Department, double Salary) {
		this.id = id;
		this.name = name;
		this.Department = Department;
		this.Salary = Salary;

	}
	public String getDepartment() {
		return Department;
	}
	public double getSalary() {
		return Salary;
	}
}
