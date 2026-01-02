package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;


public class Second {

	public static void main(String[] args) {
		LinkedList<Student> set = new LinkedList();
		set.add(new Student(2, 343));
		set.add(new Student(2, 334));

		System.out.println(set.size());
		System.out.println(set.equals(set));
		System.out.println(set.hashCode());
		System.out.println(set.contains(set));
	}

}
class Student{
	int id;
	int number;
	
	public Student(int id , int number) {
		this.id=id;
		this.number=number;
		
	}
	public String ToString() {
		return this.id+" "+this.number;
	}
	public int Hash() {
		return id;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

