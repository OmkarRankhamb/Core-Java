package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class P_F_3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> cl = Class.forName("Constructor.Lambo");
		
		Field [] fields = cl.getDeclaredFields();
		Constructor<?> [] con = cl.getDeclaredConstructors();
		for(Field f :fields) {
			System.out.println(f);
		}
		Constructor<?> conn = cl.getDeclaredConstructor(double.class);
		conn.setAccessible(true);
     Lambo lb =(Lambo)conn.newInstance(46632);	
     
     Field f= cl.getDeclaredField("price");
     f.setAccessible(true);
     System.out.println(f.getDouble(lb));
     
     Field f1 = cl.getDeclaredField("name");
    // f1.setAccessible(false);
     f1.set(lb, "ghgdsfsdj");
     System.out.println(f1.get(lb));

	}

}
class Lambo{
	private double price;
	public String name;
	
	Lambo(double price){
		this.price=price;
	}
}