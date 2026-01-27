package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Salary_AVG {

	public static void main(String[] args) {
		
        Map<Demo_7> list =List.of(
        		new Demo_7( 1,"Ram",35465.0,"IT"),
        		new Demo_7(2, "Sham",36466.0,"MC"),
        		new Demo_7(3,"Shamo",35452.0,"IT"),
        		new Demo_7(4,"Revo",645636.0,"IT"));
        
    Map <String,List<Double>> output=    list.stream()
    		.collect(Collectors.   
        		groupingBy(Demo_7::getDepartment,
        		Collectors.averagingDouble(Demo_7::getSalary)
    
   
        		
	}

}
class Demo_7{
	int id;
	String name;
	double Salary;
	String Department;
	
	public Demo_7(int id,String name,double Salary,String Department) {
		super();
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