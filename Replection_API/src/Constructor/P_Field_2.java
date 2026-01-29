package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.jar.Attributes.Name;

public class P_Field_2 {

	public static void main(String[] args) throws Exception {
         Class<?> cl = Class.forName("Constructor.Depo");
         
         Constructor<?> [] con = cl.getDeclaredConstructors();
         Field[] fields =cl.getDeclaredFields();
         for(Field c:fields) {
        	 System.out.println(c);
         }
         
         
        Constructor <?> conn = cl.getDeclaredConstructor(double.class);
           
         conn.setAccessible(true);
           
         Depo dp = (Depo)conn.newInstance(500);
      
         Field f = cl.getDeclaredField("salary");
         f.setAccessible(true);
        // f.set(dp, f);
        System.out.println(f.getDouble(dp));
        
        Field f1 = cl.getDeclaredField("name");
        f1.set(dp, "Akk SGAMI");
        System.out.println(f1.get(dp));
         
	}

}
class Depo{
	private double salary;
	public String name;
	
	private Depo(double salary) {
		this.salary=-salary;
	}
}