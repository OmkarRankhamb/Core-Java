package Oops;

import java.util.Scanner;

public class Multipal {

	public static void main(String[] args) {
         C a1 = new C();
         
         a1.printA();
         a1.PrintC();
         a1.printB();
	}

}
class A{
	void printA() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		sc.nextInt();
		System.out.println("running");
	}
	
}
class B extends A {
	void printB() {
		System.out.println("rohan is Wakking......");
	}
}
class C extends B{
	void PrintC() {
		System.out.println("magesh is a kingmekar of the grup");
	}
}

