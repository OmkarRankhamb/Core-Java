package List;

import java.util.ArrayList;

class Student {
	int id;
	double Rollno;

	public Student(int id, double Rollno) {
		this.id = id;
		this.Rollno = Rollno;
	}

	public int hashcode() {
		return id;

	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.id == s.id;
	}
}

public class Seventh {

	public static void main(String[] args) {
		ArrayList<Student> set = new ArrayList<>();
		set.add(new Student(2, 343));
		set.add(new Student(2, 334));

		System.out.println(set.size());
		System.out.println(set.equals(set));
		System.out.println(set.hashCode());
		System.out.println(set.contains(set));
	}
}
