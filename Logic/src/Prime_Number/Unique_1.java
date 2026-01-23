package Prime_Number;

public class Unique_1 {

	public static void main(String[] args) {
		 String sc = "aacbbdgejrioo";
		 StringBuffer str = new StringBuffer(sc);
		// int i;
		 int j;
		 for(int i =0; i<str.length();i++) {
			 for(j=i+1; j<str.length();j++) {
				 
				 if(str.charAt(i)==str.charAt(j)){
					 str.deleteCharAt(j);
					 str.deleteCharAt(i);
					 
				 }
				 
			 }
		 }
		 System.out.println(str);

	}

}
