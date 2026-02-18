package Shallow;

public class First {

	public static void main(String[] args) {
		test t = new test();
		
		t.i=10;
		test t2 =t;
		
		t2.i=20;
		
		System.out.println(t.i);
		System.out.println(t2.i);

	}

}
class test{
	int i;
	
	public test() {
		System.out.println("Object creat......");
	}
	
}