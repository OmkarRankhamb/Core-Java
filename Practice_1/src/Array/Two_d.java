package Array;

import java.util.Scanner;

public class Two_d {

	public static void main(String[] args) {
		int arr[][] = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		arr[3] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				arr[i][j] = sc.nextInt();

				//System.out.print(arr[i][j]);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");

			}
			 System.out.println();
		}
		
		}

	

}
