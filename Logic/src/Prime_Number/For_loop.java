package Prime_Number;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class For_loop {

	public static void main(String[] args) {
	  //  sum = 9=> print tow element
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
       // prime number
		
		int arr2 [] = {1,2,3,4,5,6,7,8,9};
		
		for(int i =1; i<arr2.length;i++) {
	
			boolean isPrime = true;
			for(int j =2; j<=i/2; j++) {
			if(i  % j==0) {
				isPrime=false;
				break;
			}
			}
			if(isPrime) {
				System.out.println("prime::"+i);
			}
			
			}
      System.out.println("========================================================");
      
     // prime number
      
//      int n;
//      int count =0;
//      
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter number");
//     n= sc.nextInt();
//      
//      for(int i=1; i<=n; i++) {
//    	   if(n%i==0) {
//    		   count++;
//    	   }
//      }
//     if(count ==2) {
//    	 System.out.println("is a prime number::"+n);
//     }
//     else
//     {
//    	 System.out.println("not prime number::"+n);
//     }
      
     System.out.println("===========================================");
      
     // max number
     
    List<Integer> list = List.of(12,34,56,78,34,56,67);
 // Optional<Integer>max=  list .stream()
	int max=	  Collections.max(list);
		//  .reduce((i,j)->Integer.max(j,i));
  System.out.println("Max number::"+max);
      
      System.out.println("============================================");
      
 List<Integer> list1=     List.of(12,34,54,56,12,43);
  Optional<Integer>min =   list1 .stream().reduce((i,j)->Integer.min(j, i));
      System.out.println("min number::"+min.get());
      
      System.out.println("==========================================");
      
    List<Integer> list2= List.of(12,34,54,56,43,12,34);
   Map<Object, Long> map=  list2 .stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
      
      System.out.println(map);
      
      System.out.println("==================================================");
      
      List<Integer> list3 =List.of(12,34,45,12,34);
      Map<Integer,Integer> mapp = list3.stream().collect(Collectors.toMap(n->n,n->1,(first,second)-> first+second));
      System.out.println(mapp);
}
}
