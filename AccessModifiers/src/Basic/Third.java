package Basic;

import java.awt.print.Book;

public class Third {

	public static void main(String[] args) {
		/**
		 * Accessing in the different class
		 * of different package
		 * with the help of the object.
		 */

		Book sbi=new Book();
		
		/**
		 * Trying to access with the help of object 
		 * in diff . class of diff. package.
		 */
		((level) sbi).display();
		/**
		 * name is: SBIPublic
		 * only public => accessible 
		 * private, default , protected => no
		 */
		
		
		System.out.println("******************");
		System.out.println("with the inheritance. in diff. package., in diff. class");
	
		level lv=new level();
		/**
		 * with the inheritance. in diff. package., in diff. class
          434343  Protected
          name is: SBIPublic
		 */
		lv.pincode();
		lv.display();
	}

}

class level extends Book
{
	public void pincode()
	{
		super.hashCode();
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
