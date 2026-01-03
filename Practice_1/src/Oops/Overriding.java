package Oops;

public class Overriding {

	public static void main(String[] args) {
       Demo1 d1 = new Remove(101,"Man");
       d1.Add();
	}

}

class Demo1 {
	int id;
	String name;

	public Demo1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void Add() {
		System.out.println("Demo is printing for the paraent class ............");
	}

}

class Remove extends Demo1 {

	public Remove(int id, String name) {
		super(id, name);
	}

	public void Add() {
		System.out.println("Remove is printing for the child class..");
	}
}
