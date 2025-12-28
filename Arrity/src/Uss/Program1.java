package Uss;

import java.util.Scanner;

public class Program1 {
	static Scanner sc = new Scanner(System.in);
	//static int arr[][]=new int[4][4];
	
	
	public static void acceptRecord(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();
			
		}
		//System.out.println();
	}
	public static void printRecord(int arr[]) {
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			//arr[i]=sc.nextInt();
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		int arr[]=new int[5];
		
		acceptRecord(arr);
		printRecord(arr);
		
	}
		 
	}
	  

