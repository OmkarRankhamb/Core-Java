package Sort;

import java.util.Arrays;
import java.util.List;

public class FourDList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","ach");
		List<String> list2 = Arrays.asList("abc","ach");

		List<String> list3= Arrays.asList("hgdfh","fdhfh");
		List<String> list4 = Arrays.asList("asds","fdghdsg");

		List<String> list5 = Arrays.asList("sdfag","hdsfh");
		List<String> list6 = Arrays.asList("hfssa","hjdgf");
		
		List<List<String>> list7 = Arrays.asList(list, list2);

		List<List<String>> list8 = Arrays.asList(list3, list4);

		List<List<String>> list9 = Arrays.asList(list5, list6);
		
		List<List<List<String>>> list10 = Arrays.asList(list7,list8,list9);
		List<List<List<String>>> list11 = Arrays.asList(list7, list8, list9);
		List<List<List<String>>> list12 = Arrays.asList(list7, list8, list9);
		List<List<List<String>>> list13 = Arrays.asList(list7, list8, list9);
		
		List<List<List<List<String>>>> list14 = Arrays.asList(list10,list11,list12,list13);
		
		  System.out.println(list14);
	int sum =	list14.stream()
		.flatMap(i->i.stream())
		.flatMap(i->i.stream())
		.flatMap(i->i.stream())
		.map(String::length)
		//.peek(System.out::println)
		.peek(i->System.out.println(i+"**"))
		//.map(i->new String(i).length())
		.reduce(0,(i,j)->(i+j));
		
	
	System.out.println(sum);

		
	}

}
