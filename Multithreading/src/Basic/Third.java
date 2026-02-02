package Basic;


public class Third {

	public static void main(String[] args){
		
		Thread t = new Thread(()->{
			for(int i=1; i<=40; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					//e.printStackTrace();
				}
				if(i%2==0) {
					System.out.println("Even::"+i);
				}
				
			}
		});
		
		Thread t1 = new Thread(()->{
			for(int i=1; i<=50; i++) {
				if(!(i %2==0)) {
			System.out.println("odd::"+i);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//System.out.println(i);
			}
		});
		t.start();
		t1.start();
		

	}

}
