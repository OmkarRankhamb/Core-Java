package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Private_Field_3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
    Class<?> cl = Class.forName("Constructor.Info");
    Field [] fields = cl.getDeclaredFields();
    Constructor<?> [] con= cl.getDeclaredConstructors();
    
     for(Field f:fields) {
    	 System.out.println(f);
     }
    
     Constructor<?> conn =cl.getDeclaredConstructor(String.class);
     conn.setAccessible(true);
    
     Info If =(Info)conn.newInstance("print re");
     
     Field f1 = cl.getDeclaredField("name");
     f1.setAccessible(true);
    System.out.println(f1.get(If));
     
    Field f2 = cl.getDeclaredField("id");
    f2.setInt(If, 45678);
    System.out.println(f2.getInt(If));
    
    
    Constructor <?> conm =cl.getDeclaredConstructor(double.class);
    conm.setAccessible(true);
    Info Iff = (Info)conm.newInstance(4565.0);
    Field f3 = cl.getDeclaredField("salary");
    f3.setAccessible(true);
  //  f3.setDouble(Iff, 30032.0);
    System.out.println(f3.getDouble(Iff));
   
    
	}

}
class Info{
	private String name;
	public int id;
	private double salary;
	
	private Info(String name) {
		this.name=name;
	}
	private Info(double salary) {
		this.salary=salary;
	}
}