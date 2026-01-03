package Exception;

public class Second_Exception {

	public static void main(String[] args) {
     int age = 20;
     try {
     if(age <18) {
    	 throw new Exception("Invalide age");
     }
     
    	
	System.out.println("valide for vote");
	}
	catch (Exception ex) {
		System.out.println(ex.getMessage());
	}
}
}
	

