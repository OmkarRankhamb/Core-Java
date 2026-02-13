package Practice;

public class First {

	public static void main(String[] args) {
 
		 
		
		
      for(int i =0; i<=10; i++) {
          if(i%2==0) {
        	  
          }
    	   
    	   System.out.println(i);
      }
      
      //Fibonacci Series (First 10 Numbers)
      
     int n =10;
     
     int a=0;
     int b=1;
     
     for(int i=0; i<=n; i++) {
    	 System.out.println(a+" ");
    	 
    	 int next = a+b;
    	 a=b;
    	 b =next;
    	 
     }
     
     //Factorial
     int num =5;
     int Factorial = 1;
     
     for(int i =1; i<=num; i++) {
    	 
    	      Factorial*=i;
     }
     System.out.println("Factorial::"+Factorial);
      
	}

}
