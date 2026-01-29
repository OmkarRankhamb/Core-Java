package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Second {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//System.out.println(Employee.class);
		
		 Class<?> cl=Class.forName("Constructor.Employee");// throws ClassNotFoundException
		
		Constructor<?>[] sc =cl.getDeclaredConstructors();
		
		System.out.println(sc);
		System.out.println(sc.length);
		System.out.println("______________________________");
		
		for(Constructor<?> s :sc) {
			System.out.println(s);
		}
		System.out.println("______________________________");
		Constructor<?> sp = cl.getDeclaredConstructor(String.class); // NoSuchMethodException, SecurityException 
		System.out.println(sp);
		
	          sp.setAccessible(true);
	          Employee  Ep= (Employee)sp.newInstance("Print re");
	          
	          System.out.println(Ep.s);
	}

}
class Employee{
	String s;
	private Employee(String s) {
		this.s=s;
	}
	public Employee(int i) {
		
	}
	public Employee(int i, String p ) {
		
	}
	}
