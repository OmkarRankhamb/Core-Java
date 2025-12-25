package Parameterized;

public class First {

	public static void main(String[] args) {
        Student s1 = new Student();
        s1.printRecord();
	}

}

class Student {
	int id;
	String name;
	int  Rollno;
	int  Branch_no;

	Student() {
		id = 101;
		name = "Shiva";
		Rollno = 2;
		Branch_no = 256;
	}

	public void printRecord() {
		
		System.out.println(" #Student Information#");
		System.out.println("  Student id== " + id);
		System.out.println("  Student name ==" + name);
		System.out.println("  Student Rollno== " + Rollno);
		System.out.println("  Student Branch_no ==" + Branch_no);
	}
}