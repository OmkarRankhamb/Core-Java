package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Fouth {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cl = Class.forName("Constructor.Enter");
           
		Constructor<?> [] con = cl.getDeclaredConstructors();
		System.out.println(con.length);
		System.out.println(con.getClass());
		System.out.println(con.hashCode());
		
		System.out.println("__________________________________________________");
		
		for(Constructor f :con) {
			System.out.println(f);
			
		}
		System.out.println("_______________________________________________");
		
		Constructor<?> com = cl.getDeclaredConstructor(int.class);
		 com.setAccessible(true);
		 
		 Enter cc=(Enter)com.newInstance(1212);
		 System.out.println(cc.i);
		 
		 System.out.println("-----------------------------------------------");
		 
		 Constructor <?> cs = cl.getDeclaredConstructor(String.class);
		 
		 cs.setAccessible(true);
       Enter En = (Enter)cs.newInstance("Omkar");
       
       System.out.println(En.s);
       System.out.println("====================================================");
       
       Constructor<?> ss = cl.getDeclaredConstructor(int.class,String.class);
       ss.setAccessible(true);
       
       Enter tr =(Enter)ss.newInstance(2323,"RAM");
       System.out.println(tr.i);
       System.out.println(tr.p);
       
       System.out.println("__________________________________________________________");
	}

}

class Enter{
	String s;
	String p;
	int i;
	public Enter(String s) {
		this.s=s;
	}
	public Enter(int i) {
		this.i=i;
	}
	public Enter(int i,String p) {
		this.i=i;
		this.p=p;
	}
}