package Demo;

public class Reversalprocess {

	public static void main(String[] args) {
       String s = "Omkar";
       String e ="omkar";
       
       for(int i=0; i<s.length(); i++) {
    	   e =s.charAt(i)+e;
       }
       System.out.println(e);
	}

}
