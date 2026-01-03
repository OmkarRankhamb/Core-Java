package Array;

import java.util.Scanner;

public class Scan_1 {

	public static void main(String[] args) {
      int arr []=new int [10];
      for(int i=0; i<arr.length; i++) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the number");
    	//  int num =sc.nextInt();
    	  arr[i]=sc.nextInt();
    	  
      }
      for(int element :arr ) {
    	  System.out.println(element);
      }
	}
	

}
