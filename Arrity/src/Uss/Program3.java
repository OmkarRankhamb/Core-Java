package Uss;

import java.util.Scanner;

public class Program3 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String args[]) {
		int arr [][]= new int [4][3];
	 int col;
	 for(int row=0; row<arr.length; row++) {
		 for(col=0; col<arr[row].length; col++) {
			 System.out.println("Enter the value");
			 arr [row][col]=sc.nextInt();
		 }
	 }
	 for(int row=0; row<arr.length;row++) {
		 for(col=0; col<arr[row].length; col++) {
			 System.out.print(arr[row][col]+" ");
		 }
		 System.out.println();
	 }
	}

	public static void main1(String[] args) {
		int arr [][] = new int [][] {{1,2,3},{4,5,6}};
		
		for(int  []i:arr) {
			for(int element :i) {
				System.out.print(element);
				
			}
			System.out.println();
		}

	}

}
