package uss;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your price");
		double price  = sc.nextDouble();
		if(price>10000)
		{ 
           System.out.println("you will gate 20 % discount");
	}
       if(price>5000 && price<10000 ) {
    	   System.out.println("you will gat 10 % discount");
       }
       if(price>2000 && price <2500) {
    	   System.out.println("you will gat 5 % discount ");
       }
       if(price<1000) {
    	   System.out.println("no discount");
       }
	}
	
}
