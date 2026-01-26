package uss;

import java.util.Scanner;

public class If_else_1 {

	public static void main(String[] args) {
		 Double Balance = 2000.0;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the pin");
		 int pin = sc.nextInt();
		 System.out.println("Withdraow Amount");
		 double WithdraowAmount= sc.nextDouble();
		 
		 if(pin==1212) {
			 
			 if(WithdraowAmount<=Balance) {
				 Balance-=WithdraowAmount;
				 System.out.println(Balance);
			 }
			 else{
				 System.out.println("insufficient balance");
			 }
		 }
		 else {
			 System.out.println("Wrong pin");
			 
		 }
		 

	}

}
