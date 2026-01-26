package uss;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		if (name.length() < 3 || name.length() > 15) {
			System.out.println("name shoude be 3 char atleast and  max 15 char ");
			return;
		}
		System.out.println("name is correct: " + name);

		System.out.println("Enter your password");
		String password = sc.nextLine();
		if (password.length() < 8) {
			System.out.println("your password will be 8 char");
			return;
		}
		System.out.println("password is corret");

		if (name.equals("omkar") && password.equals("omkar1212")) {
			{
				System.out.println("login success");
				// return;
			}

			// System.out.println("login faild");

		}
	}
}
