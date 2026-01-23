package Prime_Number;

public class unique_String {

	public static void main(String[] args) {
		
		String cs = "abcdad";
		StringBuffer str = new StringBuffer(cs);
		
		for(int i =0; i<str.length(); i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					str.deleteCharAt(j);
					str.deleteCharAt(i);
					i--;
				}
			}
		}
		System.out.println(str);
	}

}
