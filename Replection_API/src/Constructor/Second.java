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
	          System.out.println("***************************************");
	          
	          Constructor<?> con= cl.getDeclaredConstructor(int.class);
	          System.out.println(con);
	          
	          con.setAccessible(true);
	          Employee emp = (Employee)con.newInstance(5000);
	          
	          System.out.println(emp.i);
	          
	          System.out.println("***************************");
	          Constructor<?> co =cl.getDeclaredConstructor(int.class,String.class);
	            System.out.println(co);
	          
	            co.setAccessible(true);
	            
	            Employee emp2 = (Employee) co.newInstance(1223,"Print zal re");
	            System.out.println(emp2.i);
	            System.out.println(emp2.s);
	          
	          
	}

}
class Employee{
	String s;
	int i;
	private Employee(String s) {
		this.s=s;
	}
	private Employee(int i) {
		this.i=i;
	}
	private Employee(int i, String s ) {
		this.i=i;
		this.s=s;
		
		
	}
	}
