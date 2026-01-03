package Basic;

public class Construtor_1 {
	
	public static int counter;
	public static void count() {
		counter=counter+1;
		System.out.println("counter "+counter);
	}
	
public static void main(String []args) {
	
	Construtor_1.count();
	Construtor_1.count();Construtor_1.count();
}
}