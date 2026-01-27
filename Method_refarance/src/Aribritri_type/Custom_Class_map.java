package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Custom_Class_map {

	public static void main(String[] args) {
		Map<String,List<Employee> >map =  List.of(new Employee (10,13231,"IT"),
				new Employee(11,36426,"IT"),new Employee(12,3667678,"IT")
				,new Employee(13,336426,"IT"),new Employee(14,6736426,"IT"))
				.stream()
	
				.collect(Collectors.groupingBy( Employee::getDemp));
			
         System.out.println(map);
         for(Map.Entry<String,List<Employee>> m:map.entrySet()) {
        	 m.getValue().stream()
        	 .sorted((i,j)->{return Double.compare(j.getSalary(), i.getSalary());})
        	// .limit(2)
        	// .skip(1)
        	 .forEach(System.out::println);
        	 
         }
	}

}
class Employee{
	int id;
	double Salary;
	String demp;
	
	public Employee(int id , double Salary,String demp) {
		super();
		this.id=id;
		this.Salary= Salary;
		this.demp=demp;
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDemp() {
		return demp;
	}

	public void setDemp(String demp) {
		this.demp = demp;
	}
	public String toString() {
		return this.id+" "+this.Salary+" "+this.demp;
	}
}