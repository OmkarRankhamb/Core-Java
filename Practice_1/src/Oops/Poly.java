package Oops;

public class Poly {

	public static void main(String[] args) {
          Student s1 = new Student();
          System.out.println(s1.sum(10, 56));
	}

}
class Student{
	public int sum (int a,int b) {
		return a+b;
	}
	public int num (int a ,int b,int c) {
		return a+b+c;
	}
}
