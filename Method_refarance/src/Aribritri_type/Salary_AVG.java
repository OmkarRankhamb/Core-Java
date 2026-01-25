package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Lambda_1.Employee;

public class Salary_AVG {

	public static void main(String[] args) {
		
        List<Demo_4> list =List.of(
        		new Demo_4( 1,"Ram",35465.0,"IT"),
        		new Demo_4(2, "Sham",36466.0,"MC"),
        		new Demo_4(3,"Shamo",35452.0,"IT"),
        		new Demo_4(4,"Revo",645636.0,"IT"));
        
    Map <String,Double> output=    list.stream()
    		.collect(Collectors.   
        		groupingBy(Demo_4::getDepartment,
        		Collectors.averagingDouble(Demo_4::getSalary)
    
   
        		
	}

}
class Demo_4{
	int id;
	String name;
	double Salary;
	String Department;
	
	public Demo_4(int id,String name,double Salary,String Department) {
	this.id=id;
	this.name=name;
	this.Salary=Salary;
	this.Department=Department;
}
	public String getDepartmnet() {
		return Department;
	}
	public double getSalary() {
		return Salary;
	}
}