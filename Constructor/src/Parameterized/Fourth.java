package Parameterized;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.printRecord();
	}

}
class Demo{
	String name;
	int id;
	double Rollno;
	
	
	public   Demo() {
		name="Bhima";
		id=212;
		Rollno=101;
	}
	

	public void  printRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the id");
		id = sc.nextInt();
		System.out.println("Enter the Rollno");
		Rollno=sc.nextDouble();
		System.out.println(" ========");
		
	}
}


