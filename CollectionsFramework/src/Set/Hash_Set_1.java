package Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Hash_Set_1 {
    public static void main(String []args) {
    	Student st = new Student(101,"Ram",67,1);
    	Student st1 = new Student(102,"Ram",67,1);
    	
    	Set<Student> set = new HashSet<>();
    	
    	set.add(st);
    	set.add(st1);
    	
    	System.out.println(st.equals(st1));
    	System.out.println(st.equals(st1));
    	System.out.println(st.hashcode());
    	System.out.println(st1.hashcode());
    	System.out.println(set);
    	
    }
}
class Student{
	int id;
	String name;
	float mark;
	int Roll_No;
	
	public Student(int id,String name,float mark,int Roll_No) {
		this.id=id;
		this.name=name;
		this.mark=mark;
		this.Roll_No=Roll_No;
		
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.mark+""+this.Roll_No;
		
	}
	public int hashcode() {
		return Objects.hash(id,name,mark,Roll_No);
		
	}
	public boolean equles(Object obj) {
		Student st = (Student) obj;
		return this.id==st.id && this.name.equals(name) && this.mark==st.mark && this.Roll_No==st.Roll_No;
	}
}
