package Aribritri_type;

import java.util.List;
import java.util.stream.Collectors;

public class Salary_AVG {

	public static void main(String[] args) {
		
        List<Demo_4> list =List.of(
        		new Demo_4( 1,"Ram",35465.0,"IT"),
        		new Demo_4(2, "Sham",36466.0,"MC"),
        		new Demo_4(3,"Shamo",35452.0,"IT"),
        		new Demo_4(4,"Revo",645636.0,"IT"));
        
        list.stream().
        		
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