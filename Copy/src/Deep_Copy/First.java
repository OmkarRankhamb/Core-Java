package Deep_Copy;

public class First {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * 
		 */
		
		Student st = new Student("Abc");
		Student s = (Student) st.clone();

		System.out.println(st.name);
		String ab = "cdb";
		String bc =ab;
		System.out.println(ab);
	}

}

class Student implements Cloneable {
	String name;

	Student(String name) {
		this.name = name;
		System.out.println("Object created......");
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}