package Oops;

public class poly_1 {

	public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.add(101,"Babu", 676767,"Pune");
	}

}
class Demo{
	int id;
	String name;
	int  pincode;
	String city;
	
	Demo(){
		
	}
	

public void Add(int id){
	System.out.println("id"+id);
}
public void add(int id,String name) {
	System.out.println("name"+name);
}
public void add(int id, String name,int pincode,String city) {
	System.out.println("id"+id+" "+name+" "+pincode+" "+city);
}
}
