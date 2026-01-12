package Intermadit_Operation;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Student {

	public static void main(String[] args) {
         Student_1 str = new Student_1(1 ,"Devnand");
         Student_1 st2 = new Student_1(2,"Sham");
         Student_1 str3 = new Student_1(3,"Ganesh");
         
	       List<Student_1> list  = List.of(str,st2,str3);

	       Predicate<Student_1>pre =(i)->{return i.name.length()>5;};
	       
	       list.stream().filter(pre).forEach((i)->{
	    	   System.out.println(i.id);
	    	   System.out.println( i.name);
	       });
	       
	}

}
class Student_1 {
	int id;
	String name;
	
	Student_1(int id , String name){
		this.id=id;
		this.name=name;
	}
}
