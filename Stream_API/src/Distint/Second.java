package Distint;

import java.util.Comparator;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		List<Student_5> list=List.of(
				new Student_5(4,"om"),
				new Student_5(2,"Sekho"),
				new Student_5(3,"Revo"),
				new Student_5(5,"Ram"));
				
				
		list.stream().sorted(Comparator.comparing(s->s.id)).forEach(System.out::println);
    
	}

}
class Student_5{
	int id;
	String name;
	
	public Student_5(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public String  toString() {
		return id+" "+name;
	}
}