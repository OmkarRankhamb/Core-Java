package Intermadit_Operation;

import java.util.List;
import java.util.function.Predicate;

public class Employee {

	public static void main(String[] args) {
            Employe emp = new Employe(1, "Revose","Revo@746gmail.com");
            Employe emp1 = new Employe(2,"Se" ,"Sino@1012gmail.com");
            Employe emp2 = new Employe(3,"Chano","Chano@8809gmaol.com");
            
            List<Employe> em = List.of(emp,emp1,emp2);
            
            Predicate<Employe> pre =(e)->{return e.name.length()>2;};
            
           em.stream().filter(pre).forEach((e)->{
        	   System.out.println(e.id);
        	   System.out.println(e.name);
        	   System.out.println(e.Email);
           });
	}

}
class Employe{
	int id;
	String name;
	String Email;
	
	public Employe(int id , String name, String Email) {
		this.id=id;
		this.name=name;
		this.Email=Email;
				
	}
}
