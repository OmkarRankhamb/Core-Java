package Multi_Sync;

import java.util.ArrayList;
import java.util.List;




public class Second_1 {

	public static void main(String[] args) throws InterruptedException {
		Sourch src= new Sourch();
		System.out.println();
		src.Increamnet();
		src.Decrement();
		
	}

}

class Sourch{
	List<Integer> list = new ArrayList<Integer>();
//	int num = 1;
	int num =1;
        
	public void Increamnet() throws InterruptedException {
		System.out.println(list.size());
		while(list.size()<=10) {
			
			Thread.sleep(1000);
			System.out.println("Increment:::");
			
			list.add(num);
			num++;
		}
		
		
		
	}
	
	public void Decrement() throws InterruptedException {
		
		
		
		if(list.size()>=10) {
			System.out.println("nothing to remove ::::");
			list.remove(0);
			System.out.println("number is removd:::");
		}
		else {
			
	}
		System.out.println(list.size());
	}
}
