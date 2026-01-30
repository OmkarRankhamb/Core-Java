package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Private_Variable {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> cl = Class.forName("Constructor.Demoo");

		Field[] fields = cl.getDeclaredFields();
		Constructor<?>[] con =cl.getDeclaredConstructors();
		
		for(Field f :fields) {
			System.out.println(f);
			System.out.println("===============================");
			for(Constructor s :con) {
				System.out.println(s);
			}
		}
		
		Constructor<?> conn =cl.getDeclaredConstructor(String.class);
		conn.setAccessible(true);
		
		Demoo d =(Demoo)conn.newInstance("print zal re");
		
		Field f1 =cl.getDeclaredField("name");
		f1.setAccessible(true);
          System.out.println(f1.get(d));
          
          
          Method m =cl.getDeclaredMethod("getname",String.class);
          m.setAccessible(true);
        //  m.invoke(d);
          System.out.println(m.invoke(d,"sam"));
          
	}
}

class Demoo {
	private String name;
	private String city;


	private Demoo(String name) {
		this.name = name;
	}
	private String getname(String arr) {
		return this.name+" "+ this.city+arr;
	}
}