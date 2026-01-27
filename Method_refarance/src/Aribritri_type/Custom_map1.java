package Aribritri_type;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Custom_map1 {

	public static void main(String[] args) {
		Map<String, List<Student>> map = List.of(new Student(4, 1200, "ITiu"), new Student(2, 91800, "Sci"),
				new Student(3, 1600, "It"), new Student(4, 2300, "ITu"))
				.stream()
				.sorted((i, j) -> {return Double.compare(j.getsalary(), i.getsalary());})
				.peek(System.out::println).collect(Collectors.groupingBy(Student::getdemp));
	           	System.out.println(map);
		System.out.println("******************************************************");

		for (Entry<String, List<Student>> m : map.entrySet()) {
			m.getValue().stream()
			//.forEach(entry->{System.out.println(entry.getsalary()));
		//	.peek(i -> System.out.println(i + "#"))
		.sorted((k,s)->{return Double.compare(s.getsalary(), k.getsalary());})
		
			//.sorted((k, p) -> {return Double.compare(p.getsalary(), k.getsalary());
			
		//	})
					// .peek(System.out::println)
					.forEach(System.out::println);

		}

	}

}

class Student {
	int id;
	double salary;
	String demp;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public String getdemp() {
		return demp;
	}

	public void setdemp(String demp) {
		this.demp = demp;
	}

	public Student(int id, double salary, String demp) {
		super();
		this.id = id;
		this.salary = salary;
		this.demp = demp;
	}

	public String toString() {
		return this.id + " " + this.salary + " " + this.demp;
	}
}
