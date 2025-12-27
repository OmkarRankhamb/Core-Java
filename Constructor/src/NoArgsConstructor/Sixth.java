package NoArgsConstructor;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the addition: ");
		int a = sc.nextInt();
		// System.out.println(num1);
		int b = sc.nextInt();
		// System.out.println(num2);
		int result = a + b;
		System.out.println(a + b);

		Project p1 = new Project();
		p1.acceptRecord();

	}



class Magic {
	int a;
	int b;

	Magic() {

	}

	public void acceptRecord() {

		System.out.println();

	}

}
}