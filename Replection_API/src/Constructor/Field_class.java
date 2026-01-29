package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Field_class {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
     //System.out.println(Demo.class);
		
		
	Class <?> cs=Class.forName("Constructor.Demo");
	
	Field [] fields = cs.getDeclaredFields();
	
	Constructor<?> cs3 = cs.getDeclaredConstructor(double.class);
	cs3.setAccessible(true);
	
	
	Demo d1 = (Demo)cs3.newInstance(343434.0);
	
	 for(Field s :fields) {
		 System.out.println(s);
	 }
	 
	  
	Field sal = cs.getDeclaredField("Salary");
	
	sal.setAccessible(true);
	//Demo d2 = (Demo)sal.newInstance();
	
	System.out.println(sal.getDouble(cs3));
	
	

	}

}
 class Demo{
	 private double Salary;
	 public String name;
	 
	 private Demo(double Salary) {
		 this.Salary=Salary;
	 }
 }