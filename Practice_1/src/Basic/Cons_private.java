package Basic;

public class Cons_private {

	public static void main(String[] args) {
          Second s1 = Second.print();
          Second s2 = Second.print();
          Second s3 = Second.print();
          Second s4 = Second.print();
	}

}
   class Second{
	   public static int count;
	   
	private Second(){
		count=count+1;
		System.out.println(" i an here bro......."+count);
	}
	public static Second print() {
		Second ss = new Second();
		return ss;
	}
}
