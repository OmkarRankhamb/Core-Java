package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Third {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		//System.out.println(Studentt.class);
      
	      Class<?> co=Class.forName("Constructor.Studentt");
	      
	      Field [] fields = co.getDeclaredFields();
	      
	      System.out.println(co);
	      
	      Constructor<?> con = co.getDeclaredConstructor(double.class);
	      
	      
	      con.setAccessible(true);
           Studentt std = (Studentt) con.newInstance(5500.0);	   
        //   System.out.println(std.id);
		
           for(Field f :fields) {
        	   System.out.println(f);
        	   
           }
           Field sal = co.getDeclaredField("Salary");
           
         //  System.out.println(sal);
           sal.setAccessible(true);
           
           System.out.println(sal.getDouble(std));
           
           
	}

}
class Studentt{
	private double Salary;
	public int id;
	
	private Studentt(double Salary) {
		this.Salary=Salary;
	}
}