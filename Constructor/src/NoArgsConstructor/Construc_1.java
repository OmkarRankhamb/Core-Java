package NoArgsConstructor;

import java.util.Scanner;

public class Construc_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		
	       Con con = new Con();
	       con.getname();

	}

	 static class Con {
		static int id;
		String name;
		double price;

		public Con() {

		}
		
		public void getname() {
			System.out.println();
		}
	}
}
