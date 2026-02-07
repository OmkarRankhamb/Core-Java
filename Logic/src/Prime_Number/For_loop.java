package Prime_Number;

import java.util.List;

public class For_loop {

	public static void main(String[] args) {
	    
		int sum = 9;
		int  arr[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
						
				}
			}
		}
		
		System.out.println(For_loop.class);
		
		System.out.println("===========================================");
		// Odd & Even 
		
		int arr1 []= {1,2,3,4,5,6,7,8,9,0};
		
		for(int i=0; i<arr1.length; i++) {
			if(i %2 ==0) {
				System.out.println(i+" :even");
			}
			else {
				if(!(i%2==0)) {
				System.out.println(i+ ": odd");
			}
			}
		}
		
		
		System.out.println("===============================================");
       
		int arr2 [] = {1,2,3,4,5,6,7,8,9};
		
		for(int i =1; i<arr2.length;i++) {
			int num = arr2[i];
			
			if(num<=1)continue;
			boolean isPrime = true;
			for(int j =2; j<=num/2; j++) {
			if(num  % j==0) {
				isPrime=false;
				break;
			}
			}
			if(isPrime) {
				System.out.println("prime::"+num);
			}
			
			}

}
}
