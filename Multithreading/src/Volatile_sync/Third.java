package Volatile_sync;

public class Third {
	  volatile   static boolean falg;
	public static void main(String[] args) throws InterruptedException {
     Thread t1 = new Thread(()->{
    	 System.out.println("Thread is start....");
    	 while(falg) {
    	    

    		 
    	 }
    	 System.out.println("thread is end....");
     });
     t1.start();
     falg=false;
     System.out.println("setting thread is flase");
     Thread.sleep(1500);
     System.out.println("Thread is finish "+falg);
	}

}
