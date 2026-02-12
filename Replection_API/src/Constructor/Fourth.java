  package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Fourth {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		// System.out.println(place.class);
		Class<?> cl = Class.forName("Constructor.place");
		Field [] fields =cl.getDeclaredFields();
		Constructor<?>[] con = cl.getDeclaredConstructors();
		for(Constructor<?> c :con ) {
			System.out.println(c);
			
		}
		
		Constructor <?> conn =cl.getDeclaredConstructor(int.class);
		conn.setAccessible(true);
		
	place p1 =(place)conn.newInstance(34);
	Field f =cl.getDeclaredField("id");
	f.setAccessible(true);
	System.out.println(f.getInt(p1));
	
	Constructor <?> connn = cl.getDeclaredConstructor(String.class);
	connn.setAccessible(true);
	place p2 =(place)connn.newInstance("print re");

	Field f2 =cl.getDeclaredField("name");
	f2.setAccessible(true);
    System.out.println(f2.get(p2));	
    
	Constructor <?> con1 =cl.getDeclaredConstructor(int.class,String.class);
	con1.setAccessible(true);
	place p3 =(place)conn.newInstance(34,"sham");
	Field f3 =cl.getDeclaredField("i"+"namee");
	f3.setAccessible(true);
	System.out.println(f3.get(p3));

	
	}
}

class place {
	private int id;;
	private String name;
   int i;
   String namee;
	private place(String name) {
        this.name=name;
	}

	private place(int id) {
       this.id=id;
	}

	private place(int i, String namee) {
          this.i=i;
          this.name=namee;
	}
}