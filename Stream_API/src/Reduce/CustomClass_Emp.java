package Reduce;

import java.util.List;

public class CustomClass_Emp {

	public static void main(String[] args) {
        List<Emp> list= List.of(new Emp(1,"abc",121.0),
        		                new Emp(2,"cds",3535.0),
        		                new Emp(3,"sds",21122.0),
        		                new Emp(4,"saw",43655.0));
        
      Double totalSalary=  list.stream()
      //  .sorted((i,j)->Double.compare(i.Salary, j.Salary))
       // .reduce((a,b)->a.Salary<b.Salary? b:a).get();
    		  .mapToDouble(emp->emp.Salary)
    		  .sum();
      //  .skip(2)
      //  .limit(1)
        
       // .forEach(System.out::println);
        	System.out.println(totalSalary);	 
	}

}

class Emp{
	int id;String name; Double Salary;
	public Emp(int id,String name,Double Salary) {
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	public String toString() {
		return this.id+" "+ this.name+ " "+this.Salary;
	}
}