package Basic;


public class First {

	public static void main(String[] args) {
		printNumber p = new printNumber();
	//p.run();
		p.start();
		
		
		
		int count =1;
        while(count <10) {
        	if(count %2 ==0) {
        		System.out.println(count);
        	
        	}
        	System.out.println("Hello");
        	count++;
        }
	}

}
class printNumber extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
	}
	
}
