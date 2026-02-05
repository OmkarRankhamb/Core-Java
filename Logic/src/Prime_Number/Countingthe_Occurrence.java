package Prime_Number;

import java.util.HashMap;
import java.util.Map;


public class Countingthe_Occurrence {

	public static void main(String[] args) {
		
		String str = "OmkarRankhamb";
		str.toLowerCase();
		//String str2=str.toUpperCase();
		
		char [] chars = str.toCharArray();
		
		Map<Character ,Integer > map = new HashMap<>();
		
		for(int i =0; i<chars.length; i++) {
			int counter = 1;
			
			if(map.containsKey(chars [i])) {
				counter = map.get(chars[i]);
				
				map.put(chars[i],counter);
				
			}
			
			else {
				map.put(chars[i], counter);
			}
		}
		
		System.out.println(map);
		System.out.println(map.get(' '));
		
		System.out.println(map.get('A'));
	}

}
