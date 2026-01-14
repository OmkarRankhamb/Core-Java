package Lambda_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Average_Salary {

	public static void main(String[] args) {
		List<Employee> Employees = Arrays.asList(
			    new Employee(1, "john", "HR", 20000.0),
				new Employee(2, "sema", "IT", 40000), 
				new Employee(3, "john", "Finance", 90000.0),
				new Employee(4, "Rina", "IT", 350000));

		Map<String, Double> output = Employees.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
				        Collectors.averagingDouble(Employee::getsalary)
				      
				      
				        ));
		System.out.println(output);

	}

}

class Employee {
	int id;
	String name;
	String Department;
	double salary;

	public Employee(int id, String name, String Department, double salary) {
		this.id = id;
		this.name = name;
		this.Department = Department;
		this.salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public double getsalary() {
		return salary;
	}
}
