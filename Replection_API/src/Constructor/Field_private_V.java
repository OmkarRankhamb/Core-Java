package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Field_private_V {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> cl= Class.forName("Constructor.Dump");
	//	Class<?> cl2 =Class Dump;
		Field [] fields =cl.getDeclaredFields();
		for(Field c :fields) {
			System.out.println(c);
		}
		
		System.out.println("__________________Constructor_____________");
		
		Constructor<?> [] con =cl.getDeclaredConstructors();
		for(Constructor f :con) {
			System.out.println(f);
		}
	//	System.out.println("__________________Filed___________________");
		
		Constructor<?> conn =cl.getDeclaredConstructor(String.class);
		conn.setAccessible(true);
		
		Dump dum =(Dump)conn.newInstance("Revo Sam");
	
		System.out.println("________________Private Filed______________");
		
		Field f =cl.getDeclaredField("name");
		f.setAccessible(true);
		System.out.println(f.get(dum));
		
		System.out.println("_________________Public Field____________________");
		
		Field f1 =cl.getDeclaredField("id");
		f1.setInt(dum, 345678);
		System.out.println(f1.getInt(dum));
		
		System.out.println("________________Salary______________________");
		
		Field f2 =cl.getDeclaredField("salary");
		f2.setAccessible(true);
	    f2.setDouble(dum, 2344.0);
	    System.out.println(f2.getDouble(dum));
		
		System.out.println("____________Method___________________");
		
		Method m =cl.getDeclaredMethod("getname",String.class);
		m.setAccessible(true);
		System.out.println(m.invoke(dum, "Method Create karun"));
		
		

	}

}
class Dump{
	private String name;
	public int id;
	private double salary;
	
	private Dump(String name) {
		this.name=name;
	}
	private String getname(String arr) {
		return this.name+" "+arr;
	}
}