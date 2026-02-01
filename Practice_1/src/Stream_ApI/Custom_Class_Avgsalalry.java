package Stream_ApI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Custom_Class_Avgsalalry {

	public static void main(String[] args) {
		List<Employee> list =Arrays.asList(new Employee (1,2323.0,"MEdical","shoma"),
				new Employee(2,232344.0,"IT","Nino"),
				new Employee(3,43232.0,"It","Shami"));
		
	Map<String,Double>mp=	list.stream()
		.collect(Collectors.groupingBy(Employee::getDemp,
				Collectors.averagingDouble(Employee::getsalary)));
	
	   System.out.println(mp);
	}

}
class Employee{
	int id;
	double salary;
	String Demp;
	String name;
	
	public Employee(int id,double salary,String Demp,String name) {
		this.id=id;
		this.name=name;
		this.Demp=Demp;
		this.salary=salary;
	}
	public String getDemp() {
		return Demp;
	}
	public double getsalary() {
		return salary;
	}
}
