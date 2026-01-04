package Map;

import java.util.HashMap;
import java.util.Objects;

public class Map_2 {
    public static void main(String [] args) {
    	
    	Hash_1 hash = new Hash_1(101,"Dot","Pune",414728);
    	
    	HashMap<Hash_1,String > map =new  HashMap<>();
    	map.put(hash, "Venkya");
    	
    	System.out.println(map);
    }
}
class Hash_1{
	int id;
	String name;
	String city;
	int pincode;
	
	public Hash_1(int id , String name, String city , int pincode) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.pincode=pincode;
		
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.city+" "+this.pincode;
	}
	public int hashcode() {
		return Objects.hash(id,name,city,pincode);
	}
	public boolean equlas(Object obj) {
		Hash_1 hp = (Hash_1) obj;
		return this.id==hp.id && this.name.equals(obj) && this.city.equals(obj) && this.pincode==hp.pincode;
	}
	
}