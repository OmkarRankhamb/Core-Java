package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class First {
	/*
	 * Access private Constructor anothe class
	 */

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
	// System.out.println(Student.class);
	    	 
		Class<?> cl = Class.forName("Constructor.Student");
	      
		Constructor<?> [] cs = cl.getDeclaredConstructors();
		
		for(Constructor c:cs) {
			System.out.println(c);
			System.out.println("___________________________________");
			//System.out.println(c.getName());
		}
		System.out.println("______________________________________");
		Constructor<?> sc =cl.getDeclaredConstructor( String.class);
		
		       System.out.println(sc);
	     
		     
		       sc.setAccessible(true);
		       
		       
		       Student st = (Student)sc.newInstance("Omkar");
		       System.out.println(st.s);
	}

}

class Student{
	String s;
	private Student(String s) {
		this.s=s;
		System.out.println("private Cons");
	}
	
	public Student(int i) {
	}

	public Student(int i , String  p) {
		
	}
}