package Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Private_Field {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
    Class<?> cl = Class.forName("Constructor.Lab");
    
    Field[] fields =cl.getDeclaredFields();
    for(Field c: fields) {
    	System.out.println(c);
    }
    
    System.out.println("---------------------------------------------------");
    
    Constructor<?> cc= cl.getDeclaredConstructor(int.class);
    cc.setAccessible(true);
    
      Lab lb =(Lab)cc.newInstance(2322);  
      
      Field sal = cl.getDeclaredField("id");
      sal.setAccessible(true);
           System.out.println(sal.getInt(lb));
        System.out.println("________________________________________________"); 
        
//          // Constructor <?> kk =cl.getDeclaredConstructor(String.class);
//          // kk.setAccessible(true);
//            
//        //   Lab lbb =(Lab)kk.newInstance("Banks");
          Field idd =cl.getDeclaredField("name");
          
          idd.set(lb, "Ak Kumar");
//           
          System.out.println(idd.get(lb));
//           idd.setAccessible(true);
//           
//         //  idd.set(idd, kk);
//          // System.out.println(idd.canAccess(kk));
           
	}

}
class Lab{
	private int id;
	public String name;
	
	private Lab(int id) {
		this.id=id;
	}
	
}