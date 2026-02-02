package Basic;

public class First {

	public static void main(String[] args) throws Exception {
		number n1 = new number();
		
		n1.start();
		Thread.sleep(3000);
		
		int count =1;
		while(count <50) {
			System.out.println("hello");
			Thread.sleep(1500);
			count++;
		}
		
	}

}

class number extends Thread{
	public void run() {
		for(int i=0; i<50; i++) {
			try {
			Thread.sleep(5000);
			}
			catch(Exception ex){
				System.out.println(ex);
			}
			System.out.println(i);
		}
	}
}