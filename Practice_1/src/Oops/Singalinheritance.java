package Oops;

public class Singalinheritance {

	public static void main(String[] args) {
		Second s1 = new Second();
		Second s2 = new Second(110,"Roahn","pune",12,"KJJ","mubai");
		s2.pp();
		s2.print();
	}
	
             
}
	class Fourth{
		int id;
		String name;
		String city;
		
		public Fourth() {
			System.out.println("heloo....");
		}
		
		public Fourth(int id,String name,String city) {
			this.id=id;
			this.name=name;
			this.city=city;
			
		}
		public void print() {
			System.out.println("id:"+id+" "+"name: "+name+" "+"city: "+city);
		}
	}
	class Second extends Fourth {
		int id1;
		String name1;
		String city1;
		public Second() {
			System.out.println("print Second......");
			
		}
		public Second(int id2,String name1,String city1,int id,String name,String city) {
			super(id,name,city);
			this.id1=id1;
			this.name1=name1;
			this.city1=city1;
			
			
		}
		public void pp() {
			System.out.println("id1"+id1+"name1"+name1+"city1+"+city1);
		}
	}


