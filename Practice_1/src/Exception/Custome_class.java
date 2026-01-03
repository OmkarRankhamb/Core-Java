package Exception;

public class Custome_class {

	public static void main(String[] args) throws Exception {
       Loptop p1 = new Loptop();
       try {
       p1.print();
       }
       catch(Exception ex) {
    	   System.out.println(ex.getMessage());
       }
	}

}

class Loptop {
	int id = 11;
	int price = 2000;

	public void print() throws Exception  {

		if (id >10) {
			throw new Exception("not valide");
		}
          System.out.println("valide for vote"); 
	}
}
