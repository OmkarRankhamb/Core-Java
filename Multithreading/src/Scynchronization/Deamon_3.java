package Scynchronization;

public class Deamon_3 {

	public static void main(String[] args) {
    
	
	}

}
class In{
	int count;
	
	public void Incree() {
		count++;
	}
	public int getcount() {
		return count;
	}
	// not working


Thread t1 = new Thread(()->{
	for(int i=0; i<4000;i++) {
		count++;
	}
	
});

Thread t2 = new  Thread(()->{
	for(int i=0; i<4000;i++) {
		count++;
	}
});

}
