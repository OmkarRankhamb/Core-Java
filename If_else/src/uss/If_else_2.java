package uss;

import java.util.Scanner;

public class If_else_2 {

	public static void main(String[] args) {
		  Double Balance= 5000.0;
		  
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the pin ");
		 int pin = sc.nextInt();
		 System.out.println("Withdrawo Amount");
		 Double WithdrawoAmount = sc.nextDouble();
		 
		 if( pin ==1212) {
			 
			 if(WithdrawoAmount<= Balance) {
				 Balance-=WithdrawoAmount;
				 System.out.println(Balance);
				 
			 }
			 else {
				 System.out.println("insufficient balance");
			 }
			 
		 }
		 else {
			 System.out.println("Wrong pin");
		 }

	}

}
